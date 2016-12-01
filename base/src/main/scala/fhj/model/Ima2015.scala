package fhj.model

/**
  * Created by lad on 19/11/2016.
  */
object Ima2015 {

  object Students {
    val ahaxha = Student("ahaxha", "Agnesa", "Haxha", "haxhaagn15")
    val ahorina = Student("ahorina", "Alexander", "Horina", "horinaal15")
    val akrejan = Student("akrejan", "Andreas", "Krejan", "andikay")
     // val bruggenthaler = Student("bruggenthaler", "Benjamin", "Ruggenthaler", "")
    val ccoelestin = Student("ccoelestin", "Carina", "Cölestin", "SuperCari")
    val cdirnbauer = Student("cdirnbauer", "Christoph", "Dirnbauer-Karner", "dirnbaue14")
    // val cleitner = Student("cleitner", "Carina", "Leitner", "")
    // val dhasewend = Student("dhasewend", "David", "Hasewend", "")
    val dkrueger = Student("dkrueger", "Dominik", "Krüger", "dominikkrueger")
    val dmischak = Student("dmischak", "David", "Mischack", "davidm15")
    // val dstolz = Student("dstolz", "Dagmar", "Stolz", "")
    val efellner = Student("efellner", "Elisabeth", "Fellner", "ellifellner")
    //val ekeck = Student("ekeck", "Elke", "Keck", "")
    val epanholzer = Student("epanholzer", "Elisabeth", "Panholzer", "epanholzer")
    val frauchenwald = Student("frauchenwald", "Felix", "Rauchewald", "MrOrange1992")
    val freinprecht = Student("freinprecht", "Florian", "Reinprecht", "FlorianReinprecht")
    val fschopper = Student("fschopper", "Fabian", "Schopper", "schopperf")
    val jarneitz = Student("jarneitz", "Jakob", "Arneitz", "JakobArneitz")
    val kstessel = Student("kstessel", "Kevin", "Stessel", "kiv1995")
    val lbalo = Student("lbalo", "László", "Baló", "Gulasch4ever")
    val ljashanica = Student("ljashanica", "Labinot", "Jashanica", "jashanic14")
  //  val lniederdorfer = Student("lniederdorfer", "Luca", "Niederdorfer", "")
    val lschneider = Student("lschneider", "Lukas", "Schneider", "schneider-IMA15")
    val lzwatz = Student("lzwatz", "Lukas", "Zwatz", "LukZwatz")
    val mgrainer = Student("mgrainer", "Miriam", "Grainer", "mimschi")
    val mharing = Student("mharing", "Martin", "Haring", "haringma15")
  //  val mkummer = Student("mkummer", "Markus", "Kummer", "")
    // val mschnedlitz = Student("mschnedlitz", "Michael", "Schnedlitz", "")
    val mschrempf = Student("mschrempf", "Michael", "Schrempf", "michaelschrempf")
    val mskergeth = Student("mskergeth", "Markus", "Skergeth", "Mr-Get")
    val mstangl = Student("mstangl", "Michaela", "Stangl", "michistangl")
    val msteiner = Student("msteiner", "Maximilian", "Steiner", "MrPink1992")
    val mwolf = Student("mwolf", "Markus", "Wolf", "MarkusWolfIMA")
    val mzsifkovitz = Student("mzsifkovitz", "Markus", "Zsifkovits", "mzsif")
    val nhribernig = Student("nhribernig", "Nikolaus", "Hribernig", "HribernigNikolaus")
    val nspiess = Student("nspiess", "Nikolaus", "Spieß", "MrBrown1992")
    val pgoeschl = Student("pgoeschl", "Philipp", "Göschl", "philgoeschl")
    val pplank = Student("pplank", "Patrick", "Plank", "x-qlusive")
    // val pzoechner = Student("pzoechner", "Philipp", "Zöchner", "")
    val rladstaetter = Student("rladstaetter", "Robert", "Ladstätter", "rladstaetter")
    val rrobatsch = Student("rrobatsch", "Renè", "Robatsch", "robatschR")
    val sgollinger = Student("sgollinger", "Sabine", "Gollinger", "sabineGollinger")
    val skogelnik = Student("skogelnik", "Stefan", "Kogelnik", "SKogelnik")
    val swanke = Student("swanke", "Sebastian", "Wanke", "wase90168")
    val tneuhold = Student("tneuhold", "Teresa", "Neuhold", "tneuhold")
    val vfortmueller = Student("vfortmueller", "Vanessa", "Fortmüller", "fortmuel15")
    val vielnykov = Student("vielnykov", "Viktor", "Ielnykov", "ielnykov")
    val vleifert = Student("vleifert", "Verena", "Leifert", "VeeLeifert")

    val seq: Seq[Student] = Seq(
      ahaxha
      , ahorina
      , akrejan
   //   , bruggenthaler
      , ccoelestin
      , cdirnbauer
   //   , cleitner
   //   , dhasewend
      , dkrueger
      , dmischak
   //   , dstolz
      , efellner
   //   , ekeck
      , epanholzer
      , frauchenwald
      , freinprecht
      , fschopper
      , jarneitz
      , kstessel
      , lbalo
      , ljashanica
   //   , lniederdorfer
      , lschneider
      , lzwatz
      , mgrainer
      , mharing
  //    , mkummer
    //  , mschnedlitz
      , mschrempf
      , mskergeth
      , mstangl
      , msteiner
      , mwolf
      , mzsifkovitz
      , nhribernig
      , nspiess
      , pgoeschl
      , pplank
  //    , pzoechner
      , rladstaetter
      , rrobatsch
      , sgollinger
      , skogelnik
      , swanke
      , tneuhold
      , vfortmueller
      , vielnykov
      , vleifert)

  }

  import Students._

  val TestGroup = StudentGroup("Test", Seq(rladstaetter))

  val Group1 = StudentGroup("Gruppe_A",
    Seq(efellner
      , vfortmueller
      , pgoeschl
      , mgrainer
    //  , dhasewend
      , ahorina
      , vielnykov
      , frauchenwald
    //  , bruggenthaler
      , lschneider
      , nspiess
    //  , dstolz
      , msteiner
      , mwolf
    //  , pzoechner
    ))


  val Group2 = StudentGroup("Gruppe_B",
    Seq(lbalo
      , ccoelestin
      , cdirnbauer
      , ahaxha
      , nhribernig
      , ljashanica
      , akrejan
      , dkrueger
     // , mkummer
      , vleifert
      , dmischak
      , tneuhold
      , epanholzer
      , pplank
      , freinprecht
    //   , mschnedlitz
    )
  )

  val Group3 = StudentGroup("Gruppe_C",
    Seq(jarneitz
      , sgollinger
      , mharing
      //, ekeck
      , skogelnik
      //, cleitner
      //, lniederdorfer
      , rrobatsch
      , fschopper
      , mschrempf
      , mskergeth
      , mstangl
      , kstessel
      , swanke
      , mzsifkovitz
      , lzwatz)
  )

  val AllGroups: Seq[StudentGroup] = Seq(Group1, Group2, Group3)

}
