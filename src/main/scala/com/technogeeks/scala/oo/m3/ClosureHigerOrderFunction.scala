package com.technogeeks.scala.oo.m3

object ClosureHigerOrderFunction extends App {
  def mulBy(factor: Double) =
    {
      (x: Double) => factor * x

    }

  //x => x*10

  val triple = mulBy(3) //x => 3 * x
  val half = mulBy(0.5) // x => 0.5 * x
  val double = mulBy(2) // x => 2 * x
  val fourtimes = mulBy(4)

  println(triple)
  println(half)
  println(triple(10)) //10 => 3 * 10
  println(triple(14) + " " + half(14))
  println(mulBy(4.0)) //x => 4.0 * x
  println(mulBy(4.0)(2)) //=> 4.0* 2
  println(fourtimes(2))
  

}