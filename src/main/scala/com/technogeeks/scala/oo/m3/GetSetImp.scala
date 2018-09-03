package com.technogeeks.scala.oo.m3

class PrivatePerson {
  private var privateAge = 20
  var newAge = 20 

  def age = privateAge //getter ->Read

  def age_=(newAge: Int) { if (newAge > privateAge) privateAge = newAge; } //setter
}

object GetSetImp extends App {
  var f = new PrivatePerson
  f.newAge =10
  f.newAge*20

  println(f.age) // It calls f.age()

  f.age=(15) // It calls f.age=(10)
  println(f.age) // It calls f.age()

}