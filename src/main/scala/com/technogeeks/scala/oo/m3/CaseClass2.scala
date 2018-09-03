package com.technogeeks.scala.oo.m3

case class PersonNew(firstName: String, lastname: String)

object CaseClass2 extends App{
    val me = PersonNew("Sampat","Kumar1")
        val me2 = PersonNew("Sampat","Kumar")

    val first = me2.firstName
    val last = me2.lastname
    
   // val me1 = Person("Sampat","Kumar")


    
    if (me == PersonNew(first, last))
    {
      println("Found Myself")
      println("me")
    }
    else {
      println("Not Found")
    }
    
  }
