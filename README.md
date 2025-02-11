# Getting Ready

If you can run these commands, your development environment is probably ready
for our Scala interview questions.

```
$ java -version
$ git clone https://github.com/mbuccini/scala-interview-prep.git
$ cd scala-interview-prep
$ ./sbt
> test
> run
```

# About SBT and this this Project

SBT is the standard build tool in the Scala ecosystem. However, it is still
common for many projects and organizations to use Maven, Pants, Gradle, etc.

If you prefer a different build environment, that's awesome. Some interview
questions may ask to implement something from nothing, and some may want to
watch you interact with a pre-existing codebase. For the former, it doesn't
matter what you use, as long as you're able to get things setup quickly.

For the latter (interacting with a pre-existing codebase), we'll be using
SBT. We aren't really specifically interested in how you write SBT project
files, but want you to quickly get them up and running.

This project comes with a built-in `sbt` script that'll run on OS X or Linux.
However, you can feel free to use your own SBT runner if you prefer.

# Useful References

 * [Getting Started with sbt](http://www.scala-sbt.org/release/tutorial/)
 * [Installing sbt on Windows](http://www.scala-sbt.org/0.13/tutorial/Installing-sbt-on-Windows.html)
 * IDE Specific Instructions:
   * [Intellij IDEA](https://www.jetbrains.com/idea/help/getting-started-with-sbt.html)
   * [Eclipse / Scala IDE](http://scala-ide.org/docs/user/gettingstarted.html#Import_an_SBT_project)
