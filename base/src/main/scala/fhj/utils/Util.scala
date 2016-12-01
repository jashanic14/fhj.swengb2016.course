package fhj.utils

/**
  * Created by lad on 20/11/2016.
  */
object Util {

  def logInfo(m: => String): Unit = System.out.println("INFO: " + m)

  def logError(m: => String): Unit = System.err.println("ERROR:" + m)

  def printToFile(f: java.io.File)(op: java.io.PrintWriter => Unit): Unit = {
    val p = new java.io.PrintWriter(f)
    try {
      op(p)
    } finally {
      p.close()
    }
  }

}
