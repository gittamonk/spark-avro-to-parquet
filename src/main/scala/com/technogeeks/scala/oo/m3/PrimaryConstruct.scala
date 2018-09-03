package com.technogeeks.scala.oo.m3


class PrimPerson(val name:String, val age:Int) {
	println("Inside Prim Person constructor")
	def desc= "Name of person "+ name + " and age is "+ age
}


object PrimaryConstruct extends App {
  var d1 = new PrimPerson("Sam", 5)
 // println(d1.desc)
}