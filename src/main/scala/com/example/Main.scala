package com.example

import com.softwaremill.sttp._
import com.softwaremill.sttp.akkahttp._
import com.softwaremill.sttp.json4s._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

case class HttpBinResponse(origin: String, headers: Map[String, String])

object Main extends App {

  override def main(args: Array[String]): Unit = {

    implicit val serialization =  org.json4s.native.Serialization
    implicit val backend = AkkaHttpBackend()

    val request = sttp
      .get(uri"https://httpbin.org/get")
      .response(asJson[HttpBinResponse])

    val response: Future[Response[HttpBinResponse]] = request.send()

    // code here

    backend.close()

  }
}
