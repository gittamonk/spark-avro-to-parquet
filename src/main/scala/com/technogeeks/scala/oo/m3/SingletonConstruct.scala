package com.technogeeks.scala.oo.m3

object SingletonReservations {
  private var lastNum = 0;
  val someconst = 3.14
  def newReservationNum() = { lastNum += 1; lastNum }
}

class SingletonConstruct1 {
   var lastNum = 0;
     def newReservationNum() = { lastNum += 1; lastNum }

  
}


object SingletonConstruct extends App {
  var test = new SingletonConstruct1() //Normal Instances
    var test1 = new SingletonConstruct1() //Normal Instances

  val a1 = test.newReservationNum() //1
    val a2 = test1.newReservationNum() //1
  println("a1: " + a1 + " a2: " + a2)

  /*val test2 = new SingletonReservations()
    val test3 = new SingletonReservations()
 val b1 =  test2.newReservationNum()
 val b2 =  test3.newReservationNum()
 
   println("b1: " + b1 + " b2: " + b2)*/


  
  val r1 = SingletonReservations.newReservationNum //1
  val r2 = SingletonReservations.newReservationNum //2
  val r3 = SingletonReservations.newReservationNum //3
  val r4 = SingletonReservations.someconst
  println("r1: " + r1 + " r2: " + r2 + " r3: " + r3)
}