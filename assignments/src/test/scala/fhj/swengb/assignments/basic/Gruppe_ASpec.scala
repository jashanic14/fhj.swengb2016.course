package fhj.swengb.assignments.basic

import fhj.model.Github
import fhj.model.Ima2015.Students
import org.scalatest.WordSpec

class Gruppe_ASpec extends WordSpec {

  import fhj.model.Ima2015.Students._

   "Elisabeth Fellner" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.efellner.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.efellner.githubUserName in assert(Github.exists(efellner), "Github account for Elisabeth Fellner does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/ellifellner/android-BasicGestureDetect" in assert(Github.exists(efellner,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Elisabeth Fellnerdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(efellner.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(efellner.fileIn("android-BasicGestureDetect", ".gitignore")))
          "have a BasicGestgur file commited" in assert(Github.exists(efellner.fileIn("android-BasicGestureDetect", "Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
       }
     }

      

}
