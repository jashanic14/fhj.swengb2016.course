package fhj.swengb.assignments.basic

import java.io.File

import fhj.model.{Ima2015, Student}
import fhj.utils.Util

/**
  * Created by lad on 25/11/2016.
  */
object Codegenerator {

  def mkClazz(clazzName: String, body: String): String = {
    s"""package fhj.swengb.assignments.basic
       |
       |import fhj.model.Github
       |import fhj.model.Ima2015.Students
       |import org.scalatest.WordSpec
       |
       |class ${clazzName}Spec extends WordSpec {
       |
       |  import fhj.model.Ima2015.Students._
       |
       |$body
       |
       |}
       |""".stripMargin
  }

  private def mkTestCode(s: Student): String = {
    s"""   "${s.fullName}" when {
       |       "participating in SWENGB," should {
       |         "have a github account communicated" in assert(Students.${s.id}.githubUserName.nonEmpty)
       |         "have created a github account at http://github.com/" + Students.${s.id}.githubUserName in assert(Github.exists(${s.id}), "Github account for ${s.fullName} does not exist")
       |
       |       }
       |      "submitting android-BasicGestureDetect" should {
       |          "have a repository named http://github.com/${s.githubUserName}/android-BasicGestureDetect" in assert(Github.exists(${s.id},"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for ${s.fullName}does not exist!")
       |          "have not committed local.properties" in assert(!Github.exists(${s.id}.fileIn("android-BasicGestureDetect", "local.properties")))
       |          "have a .gitignore file commited" in assert(Github.exists(${s.id}.fileIn("android-BasicGestureDetect", ".gitignore")))
       |       |       }
       |     }
      """.stripMargin
  }


  def main(args: Array[String]): Unit = {

    val parent = new File("/Users/lad/Documents/fhj/course/assignments/src/test/scala/fhj/swengb/assignments/basic")
    // mk group spec
    for (g <- Ima2015.AllGroups) yield {
      val body = g.members.map(mkTestCode).mkString("\n")
      Util.printToFile(new File(parent, g.name + "Spec.scala"))(pw => pw.append(mkClazz(g.name, body)))
    }
    // mk allspec
    Util.printToFile(new File(parent, "AllSpec.scala"))(pw => pw.append(mkClazz("All", Ima2015.Students.seq.map(mkTestCode).mkString("\n"))))


    println("Finished code generation.")
  }


}
