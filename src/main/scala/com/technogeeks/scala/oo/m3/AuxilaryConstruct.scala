package com.technogeeks.scala.oo.m3

class AuxCon{
  var size = 0;
  var age = 0;
  println("Spark Begin")
  def this(size: Int) {
    this() // Calls the primary constructor
    this.size = size
    println("This is the Primary ONE ARGUMENT const -> " + this.size)
  }

  def this(size: Int, age: Int) {
   //this(size) // calls previous auxiliary constructor
    this(age)
    this.age = age
    println("This is the Primary TWO ARGUMENT const-> " + this.size + "Age is -> " + this.age)

  }
  println("Spark END")

}

object AuxilaryConstruct extends App {
  var ac1 = new AuxCon() //this()
  println("*******ONE ARGUMENT CONST**************")
  var ac2 = new AuxCon(5) //this(size)
  println("********TWO ARGUMENT CONST*********")
  var ac3 = new AuxCon(5, 10) //this(size,age)
  println("****************************")
  //println(ac1.size + "," + ac1.age)
  println(ac2.size, ac2.age)
  println(ac3.size, ac3.age)

}
