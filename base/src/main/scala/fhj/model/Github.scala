package fhj.model

import java.net.{HttpURLConnection, URL}

import fhj.utils.Util

import scala.io.{BufferedSource, Source}
import scala.util.Try


/**
  * This assignment checks that everybody has a github repository defined and
  * this github repository actually exists.
  */
object Github {

  // checks if an url exists
  def exists(url: URL): Boolean = {
    println("## Checking if " + url.toString + " exists ...")
    url.openConnection() match {
      case huc: HttpURLConnection =>
        huc.setRequestMethod("HEAD")
        huc.getResponseCode == 200
      case _ => ???
    }
  }

  /**
    * Fetches an URL and checks if a certain string is contained
    *
    * @param url
    * @param needle
    * @return
    */
  def fetchAndCheck(url: URL, needle: String): Boolean = {
    println("## FETCHING " + url.toString)
    val contents: BufferedSource = Source.fromURL(url)
    contents.getLines().exists(s => {
      //        println(">> " + s)
      s.contains(needle)
    })
  }

  /**
    * Given an URL and a needle returns either true or false with some additional error checking mechanisms
    *
    * @param url
    * @param needle
    * @return
    */
  private def checkUrl(url: URL, needle: String) = {
    Try(fetchAndCheck(url, needle)).toOption match {
      case None =>
        Util.logError("There was an error fetching " + url.toString + ".")
        false
      case Some(x) if !x =>
        println("MUCCHA:" + x + ">>>")
        Util.logError(url.toString + " exists, but there is an error on the site anyway.")
        x
      case Some(x) => x // we are happy with the result
    }
  }

  /**
    * Checks for a github repository
    *
    * @param s
    * @return
    */
  def exists(student: Student, repositoryName: String): Boolean = {
    val githubUserName = student.githubUserName
    require(githubUserName.nonEmpty, "Github username must not be empty!")
    require(!repositoryName.isEmpty, "repository name must not be empty")
    checkUrl(new URL("https://github.com/" + githubUserName + "/" + repositoryName), repositoryName)

  }


  /**
    * Returns true if a github account actually exists, false otherwise.
    *
    * @param student the student
    * @return
    */
  def exists(student: Student): Boolean = {
    val githubUserName = student.githubUserName
    require(githubUserName.nonEmpty, "Github username must not be empty!")
    checkUrl(new URL("https://github.com/" + githubUserName), githubUserName)
  }


}