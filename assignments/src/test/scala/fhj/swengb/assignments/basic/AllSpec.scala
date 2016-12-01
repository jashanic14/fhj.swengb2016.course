package fhj.swengb.assignments.basic

import fhj.model.Github
import fhj.model.Ima2015.Students
import org.scalatest.WordSpec

class AllSpec extends WordSpec {

  import fhj.model.Ima2015.Students._

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
      
   "Alexander Horina" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.ahorina.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.ahorina.githubUserName in assert(Github.exists(ahorina), "Github account for Alexander Horina does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/horinaal15/android-BasicGestureDetect" in assert(Github.exists(ahorina,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Alexander Horinadoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(ahorina.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(ahorina.fileIn("android-BasicGestureDetect", ".gitignore")))
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
      
   "Elisabeth Fellner" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.efellner.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.efellner.githubUserName in assert(Github.exists(efellner), "Github account for Elisabeth Fellner does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/ellifellner/android-BasicGestureDetect" in assert(Github.exists(efellner,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Elisabeth Fellnerdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(efellner.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(efellner.fileIn("android-BasicGestureDetect", ".gitignore")))
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
      
   "Felix Rauchewald" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.frauchenwald.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.frauchenwald.githubUserName in assert(Github.exists(frauchenwald), "Github account for Felix Rauchewald does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/MrOrange1992/android-BasicGestureDetect" in assert(Github.exists(frauchenwald,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Felix Rauchewalddoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(frauchenwald.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(frauchenwald.fileIn("android-BasicGestureDetect", ".gitignore")))
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
      
   "Lukas Schneider" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.lschneider.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.lschneider.githubUserName in assert(Github.exists(lschneider), "Github account for Lukas Schneider does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/schneider-IMA15/android-BasicGestureDetect" in assert(Github.exists(lschneider,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Lukas Schneiderdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(lschneider.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(lschneider.fileIn("android-BasicGestureDetect", ".gitignore")))
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
      
   "Miriam Grainer" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.mgrainer.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.mgrainer.githubUserName in assert(Github.exists(mgrainer), "Github account for Miriam Grainer does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/mimschi/android-BasicGestureDetect" in assert(Github.exists(mgrainer,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Miriam Grainerdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(mgrainer.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(mgrainer.fileIn("android-BasicGestureDetect", ".gitignore")))
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
      
   "Maximilian Steiner" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.msteiner.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.msteiner.githubUserName in assert(Github.exists(msteiner), "Github account for Maximilian Steiner does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/MrPink1992/android-BasicGestureDetect" in assert(Github.exists(msteiner,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Maximilian Steinerdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(msteiner.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(msteiner.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Markus Wolf" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.mwolf.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.mwolf.githubUserName in assert(Github.exists(mwolf), "Github account for Markus Wolf does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/MarkusWolfIMA/android-BasicGestureDetect" in assert(Github.exists(mwolf,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Markus Wolfdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(mwolf.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(mwolf.fileIn("android-BasicGestureDetect", ".gitignore")))
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
      
   "Nikolaus Spieß" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.nspiess.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.nspiess.githubUserName in assert(Github.exists(nspiess), "Github account for Nikolaus Spieß does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/MrBrown1992/android-BasicGestureDetect" in assert(Github.exists(nspiess,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Nikolaus Spießdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(nspiess.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(nspiess.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Philipp Göschl" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.pgoeschl.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.pgoeschl.githubUserName in assert(Github.exists(pgoeschl), "Github account for Philipp Göschl does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/philgoeschl/android-BasicGestureDetect" in assert(Github.exists(pgoeschl,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Philipp Göschldoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(pgoeschl.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(pgoeschl.fileIn("android-BasicGestureDetect", ".gitignore")))
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
      
   "Robert Ladstätter" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.rladstaetter.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.rladstaetter.githubUserName in assert(Github.exists(rladstaetter), "Github account for Robert Ladstätter does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/rladstaetter/android-BasicGestureDetect" in assert(Github.exists(rladstaetter,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Robert Ladstätterdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(rladstaetter.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(rladstaetter.fileIn("android-BasicGestureDetect", ".gitignore")))
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
      
   "Vanessa Fortmüller" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.vfortmueller.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.vfortmueller.githubUserName in assert(Github.exists(vfortmueller), "Github account for Vanessa Fortmüller does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/fortmuel15/android-BasicGestureDetect" in assert(Github.exists(vfortmueller,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Vanessa Fortmüllerdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(vfortmueller.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(vfortmueller.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      
   "Viktor Ielnykov" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.vielnykov.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.vielnykov.githubUserName in assert(Github.exists(vielnykov), "Github account for Viktor Ielnykov does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/ielnykov/android-BasicGestureDetect" in assert(Github.exists(vielnykov,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Viktor Ielnykovdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(vielnykov.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(vielnykov.fileIn("android-BasicGestureDetect", ".gitignore")))
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
      

}
