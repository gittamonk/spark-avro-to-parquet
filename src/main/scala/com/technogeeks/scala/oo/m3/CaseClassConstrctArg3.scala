package com.technogeeks.scala.oo.m3


case class People(val size:Int, val age:Int) {
	println("Inside duck constructor")
	def desc= "Duck of age "+ age + " is of size "+ size
}


object CaseClassConstrctArg3 extends App {
  var d1 =  People(10, 5)
  println("Construction Done")
 // var d2 = new PrimDuck()
  println(d1.desc) //Try commenting this
}