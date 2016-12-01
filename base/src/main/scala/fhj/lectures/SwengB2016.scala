package fhj.lectures

import java.time.{LocalDateTime, Month}

import fhj.model.{Ima2015, Student}


sealed trait Event

case class Lecture(participants: Set[Student],
                   date: LocalDateTime,
                   topic: String,
                   hours: Int = 2) extends Event

case class Lab(participants: Set[Student]
               , date: LocalDateTime
               , topic: String
               , hours: Int = 9) extends Event

abstract class Assignment(name: String
                          , description: String
                          , points: Int)

/**
  * Created by lad on 26/11/2016.
  */
object SwengB2016 {

  import Ima2015.Students._

  case object BasicGesture extends
    Assignment("Basic Gesture",
      "Eine existierende Java Android App wird auf Scala portiert.", 0)

  case object Sierpinski extends Assignment("Sierpinski Triangle", "Eine Android app die ein Sierpinski Dreieck zeichnet.", 0)

  case object FHTris extends Assignment("FHTris", "Ein einfacher Tetris clone.", 0)

  val Lecture1 = Lecture(Ima2015.Students.seq.toSet -- Set(ahorina)
    , LocalDateTime.of(2016, Month.NOVEMBER, 22, 16, 0)
    , "Einführung, Android Overview")

  val Lecture2 = Lecture(Ima2015.Students.seq.toSet -- Set()
    , LocalDateTime.of(2016, Month.NOVEMBER, 29, 16, 30), "")

  val Lecture3 = Lecture(Ima2015.Students.seq.toSet -- Set(), LocalDateTime.of(2016, Month.DECEMBER, 13, 16, 0), "")

  val Lecture4 = Lecture(Ima2015.Students.seq.toSet -- Set(), LocalDateTime.of(2017, Month.JANUARY, 10, 16, 0), "")

  val Lab1 = Lab(Ima2015.Students.seq.toSet -- Set(ahorina, vielnykov)
    , LocalDateTime.of(2016, Month.NOVEMBER, 25, 8, 0), "Aufsetzen Gradle, BasicMotionGesture")

  val Lab2 = Lab(Ima2015.Students.seq.toSet -- Set()
    , LocalDateTime.of(2016, Month.DECEMBER, 2, 8, 0), "")

  val Lab3 = Lab(Ima2015.Students.seq.toSet -- Set()
    , LocalDateTime.of(2016, Month.DECEMBER, 16, 8, 0), "")

  val Lab4 = Lab(Ima2015.Students.seq.toSet -- Set()
    , LocalDateTime.of(2017, Month.JANUARY, 13, 8, 0), "")

  val Lab5 = Lab(Ima2015.Students.seq.toSet -- Set()
    , LocalDateTime.of(2017, Month.JANUARY, 20, 8, 0), "")

  val Lab6 = Lab(Ima2015.Students.seq.toSet -- Set()
    , LocalDateTime.of(2017, Month.FEBRUARY, 3, 9, 0), "", 3)

  val lectures: Seq[Lecture] = Seq(Lecture1, Lecture2, Lecture3, Lecture4)
  val labs: Seq[Lab] = Seq(Lab1, Lab2, Lab3, Lab4, Lab5, Lab6)
}
