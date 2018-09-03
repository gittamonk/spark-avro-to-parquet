package com.technogeeks.scala.oo.m3

trait Logger1 {
  def log1(msg: String)  //abstract 
  def log2(msg: String){ } // concreate 
}

 class ConsoleLogger1 extends Logger1 {
   def log1(msg: String) { println(msg) } // No override needed
  // override def log2(msg: String){println("Test") } 
}

object TraitBasic extends App {
  val logger = new ConsoleLogger1
  logger.log1("Hi..! I am printing from Main..!!")
    logger.log2("Hi..! I am printing from Main.2.!!")

}