package fhj.swengb.assignments.basic

import fhj.model.Github
import fhj.model.Ima2015.Students
import org.scalatest.WordSpec

class Gruppe_CSpec extends WordSpec {

  import fhj.model.Ima2015.Students._

   "Jakob Arneitz" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.jarneitz.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.jarneitz.githubUserName in assert(Github.exists(jarneitz), "Github account for Jakob Arneitz does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/JakobArneitz/android-BasicGestureDetect" in assert(Github.exists(jarneitz,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Jakob Arneitzdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(jarneitz.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(jarneitz.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Sabine Gollinger" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.sgollinger.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.sgollinger.githubUserName in assert(Github.exists(sgollinger), "Github account for Sabine Gollinger does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/sabineGollinger/android-BasicGestureDetect" in assert(Github.exists(sgollinger,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Sabine Gollingerdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(sgollinger.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(sgollinger.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Martin Haring" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.mharing.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.mharing.githubUserName in assert(Github.exists(mharing), "Github account for Martin Haring does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/haringma15/android-BasicGestureDetect" in assert(Github.exists(mharing,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Martin Haringdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(mharing.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(mharing.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Stefan Kogelnik" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.skogelnik.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.skogelnik.githubUserName in assert(Github.exists(skogelnik), "Github account for Stefan Kogelnik does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/SKogelnik/android-BasicGestureDetect" in assert(Github.exists(skogelnik,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Stefan Kogelnikdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(skogelnik.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(skogelnik.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Renè Robatsch" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.rrobatsch.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.rrobatsch.githubUserName in assert(Github.exists(rrobatsch), "Github account for Renè Robatsch does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/robatschR/android-BasicGestureDetect" in assert(Github.exists(rrobatsch,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Renè Robatschdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(rrobatsch.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(rrobatsch.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Fabian Schopper" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.fschopper.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.fschopper.githubUserName in assert(Github.exists(fschopper), "Github account for Fabian Schopper does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/schopperf/android-BasicGestureDetect" in assert(Github.exists(fschopper,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Fabian Schopperdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(fschopper.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(fschopper.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Michael Schrempf" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.mschrempf.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.mschrempf.githubUserName in assert(Github.exists(mschrempf), "Github account for Michael Schrempf does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/michaelschrempf/android-BasicGestureDetect" in assert(Github.exists(mschrempf,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Michael Schrempfdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(mschrempf.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(mschrempf.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Markus Skergeth" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.mskergeth.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.mskergeth.githubUserName in assert(Github.exists(mskergeth), "Github account for Markus Skergeth does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/Mr-Get/android-BasicGestureDetect" in assert(Github.exists(mskergeth,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Markus Skergethdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(mskergeth.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(mskergeth.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Michaela Stangl" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.mstangl.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.mstangl.githubUserName in assert(Github.exists(mstangl), "Github account for Michaela Stangl does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/michistangl/android-BasicGestureDetect" in assert(Github.exists(mstangl,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Michaela Stangldoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(mstangl.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(mstangl.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Kevin Stessel" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.kstessel.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.kstessel.githubUserName in assert(Github.exists(kstessel), "Github account for Kevin Stessel does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/kiv1995/android-BasicGestureDetect" in assert(Github.exists(kstessel,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Kevin Stesseldoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(kstessel.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(kstessel.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Sebastian Wanke" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.swanke.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.swanke.githubUserName in assert(Github.exists(swanke), "Github account for Sebastian Wanke does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/wase90168/android-BasicGestureDetect" in assert(Github.exists(swanke,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Sebastian Wankedoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(swanke.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(swanke.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Markus Zsifkovits" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.mzsifkovitz.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.mzsifkovitz.githubUserName in assert(Github.exists(mzsifkovitz), "Github account for Markus Zsifkovits does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/mzsif/android-BasicGestureDetect" in assert(Github.exists(mzsifkovitz,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Markus Zsifkovitsdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(mzsifkovitz.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(mzsifkovitz.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Lukas Zwatz" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.lzwatz.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.lzwatz.githubUserName in assert(Github.exists(lzwatz), "Github account for Lukas Zwatz does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/LukZwatz/android-BasicGestureDetect" in assert(Github.exists(lzwatz,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Lukas Zwatzdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(lzwatz.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(lzwatz.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      

}
