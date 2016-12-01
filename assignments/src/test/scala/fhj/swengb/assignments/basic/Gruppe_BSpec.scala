package fhj.swengb.assignments.basic

import fhj.model.Github
import fhj.model.Ima2015.Students
import org.scalatest.WordSpec

class Gruppe_BSpec extends WordSpec {

  import fhj.model.Ima2015.Students._

   "László Baló" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.lbalo.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.lbalo.githubUserName in assert(Github.exists(lbalo), "Github account for László Baló does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/Gulasch4ever/android-BasicGestureDetect" in assert(Github.exists(lbalo,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for László Balódoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(lbalo.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(lbalo.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Carina Cölestin" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.ccoelestin.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.ccoelestin.githubUserName in assert(Github.exists(ccoelestin), "Github account for Carina Cölestin does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/SuperCari/android-BasicGestureDetect" in assert(Github.exists(ccoelestin,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Carina Cölestindoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(ccoelestin.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(ccoelestin.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Christoph Dirnbauer-Karner" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.cdirnbauer.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.cdirnbauer.githubUserName in assert(Github.exists(cdirnbauer), "Github account for Christoph Dirnbauer-Karner does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/dirnbaue14/android-BasicGestureDetect" in assert(Github.exists(cdirnbauer,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Christoph Dirnbauer-Karnerdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(cdirnbauer.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(cdirnbauer.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Agnesa Haxha" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.ahaxha.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.ahaxha.githubUserName in assert(Github.exists(ahaxha), "Github account for Agnesa Haxha does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/haxhaagn15/android-BasicGestureDetect" in assert(Github.exists(ahaxha,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Agnesa Haxhadoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(ahaxha.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(ahaxha.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Nikolaus Hribernig" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.nhribernig.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.nhribernig.githubUserName in assert(Github.exists(nhribernig), "Github account for Nikolaus Hribernig does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/HribernigNikolaus/android-BasicGestureDetect" in assert(Github.exists(nhribernig,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Nikolaus Hribernigdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(nhribernig.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(nhribernig.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Labinot Jashanica" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.ljashanica.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.ljashanica.githubUserName in assert(Github.exists(ljashanica), "Github account for Labinot Jashanica does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/jashanic14/android-BasicGestureDetect" in assert(Github.exists(ljashanica,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Labinot Jashanicadoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(ljashanica.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(ljashanica.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Andreas Krejan" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.akrejan.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.akrejan.githubUserName in assert(Github.exists(akrejan), "Github account for Andreas Krejan does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/andikay/android-BasicGestureDetect" in assert(Github.exists(akrejan,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Andreas Krejandoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(akrejan.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(akrejan.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Dominik Krüger" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.dkrueger.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.dkrueger.githubUserName in assert(Github.exists(dkrueger), "Github account for Dominik Krüger does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/dominikkrueger/android-BasicGestureDetect" in assert(Github.exists(dkrueger,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Dominik Krügerdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(dkrueger.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(dkrueger.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Verena Leifert" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.vleifert.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.vleifert.githubUserName in assert(Github.exists(vleifert), "Github account for Verena Leifert does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/VeeLeifert/android-BasicGestureDetect" in assert(Github.exists(vleifert,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Verena Leifertdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(vleifert.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(vleifert.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "David Mischack" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.dmischak.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.dmischak.githubUserName in assert(Github.exists(dmischak), "Github account for David Mischack does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/davidm15/android-BasicGestureDetect" in assert(Github.exists(dmischak,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for David Mischackdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(dmischak.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(dmischak.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Teresa Neuhold" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.tneuhold.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.tneuhold.githubUserName in assert(Github.exists(tneuhold), "Github account for Teresa Neuhold does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/tneuhold/android-BasicGestureDetect" in assert(Github.exists(tneuhold,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Teresa Neuholddoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(tneuhold.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(tneuhold.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Elisabeth Panholzer" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.epanholzer.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.epanholzer.githubUserName in assert(Github.exists(epanholzer), "Github account for Elisabeth Panholzer does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/epanholzer/android-BasicGestureDetect" in assert(Github.exists(epanholzer,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Elisabeth Panholzerdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(epanholzer.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(epanholzer.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Patrick Plank" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.pplank.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.pplank.githubUserName in assert(Github.exists(pplank), "Github account for Patrick Plank does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/x-qlusive/android-BasicGestureDetect" in assert(Github.exists(pplank,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Patrick Plankdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(pplank.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(pplank.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Florian Reinprecht" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.freinprecht.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.freinprecht.githubUserName in assert(Github.exists(freinprecht), "Github account for Florian Reinprecht does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/FlorianReinprecht/android-BasicGestureDetect" in assert(Github.exists(freinprecht,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Florian Reinprechtdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(freinprecht.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(freinprecht.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      

}
