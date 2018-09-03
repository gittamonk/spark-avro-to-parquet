package com.technogeeks.scala.oo.m3

object HigherOrderFunctions extends App {
/*
 * 1 to 10 (x,y) {}
 * 
 * {1,2,3,4,5,6}
 * 3,3,4,5,6 
 * 6,4,5,6
 */
  
  /*
   * (a,b)
   * if a.length > b.length
   *   a
   *   else
   *   b
   * 
   * 
   * 
   */
  
  
  
  
  
  
  def demo {
    println("===============================")
    (1 to 9).map(0.1 * _).foreach(println)
    println("===============================")

    (1 to 9).map("*" * _).foreach(println _)
    println("===============================")

    (1 to 9).filter(_ % 2 == 0).foreach(println _)
    println("===============================")

    println((1 to 5).reduceLeft(_ * _))
    println("===============================")
    
    val peeps = Vector("al", "hannah", "emily", "christina", "aleka")
    
    
    
    
    peeps.reduceLeft((x,y) => if (x.length > y.length) x else y)

    val a = Array(12, 6, 15, 2, 20, 9)
    println(a.reduceLeft(_ max _))
    
    println("==============================")
    val b = Array(1, 2, 3)
    b.reduceLeft(_ + _)
    b.foldLeft(20)(_ + _)

    println("===============================")

    val x = "Mary had a little lamb".split(" ").sortWith(_.length < _.length)
    
        val y = "Mary had a little lamb".split(" ").sortWith((x,y)=>x.length < y.length)

    for (i <- x) println(i)
    println("===============================")

  }

  demo
}