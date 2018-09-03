package com.technogeeks.scala.oo.m3

import scala.io.Source
import scala.util.{Try,Success,Failure}

object TruSuccessFail extends App {

    def readTextFile(filename: String): Try[List[String]] = {
        Try(Source.fromFile(filename).getLines.toList)
    }

    val filename = "/etc/passwd"
    readTextFile(filename) match {
        case Success(lines) => lines.foreach(println)
        case Failure(f) => println(f)
    }

}