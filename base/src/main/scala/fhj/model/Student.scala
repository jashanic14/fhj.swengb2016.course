package fhj.model

import java.net.URL

/**
  * Created by lad on 19/11/2016.
  */
case class Student(id: String
                   , firstName: String
                   , secondName: String
                   , githubUserName: String) {

  lazy val fullName: String = firstName + " " + secondName

  lazy val gitHubRepo : URL= new URL(s"http://github.com/$githubUserName/")

  def fileIn(projectName: String, uri : String) : URL = new URL(s"https://raw.githubusercontent.com/${githubUserName}/$projectName/master/$uri")

}

/**
  * Created by lad on 19/11/2016.
  */
case class StudentGroup(name: String, members: Seq[Student])
