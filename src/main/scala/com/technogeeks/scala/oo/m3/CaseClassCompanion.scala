package com.technogeeks.scala.oo.m3


object CaseClassCompanion extends App{
  
  println("Step 1: How to define a simple class to represent a ScalaCom object")
  class ScalaCom(name: String, productCode: Long){

    def print = println(s"Book name = $name, productCode = $productCode")

  }

//WARNING IN REPL :warning: previously defined class ScalaCom is not a companion to 
  //object ScalaCom.
//Companions must be defined together; you may wish to use :paste mode for this. 
 // exit :paste mode  -> CNTRL+D


  println("\nStep 2: How to declare a companion object for the ScalaCom class")
  object ScalaCom {

    def apply(name: String, productCode: Long): ScalaCom = {
      new ScalaCom(name, productCode)
    }

  }

  


  println("\nStep 3: How to create instances of the ScalaCom class using the companion object")
  val scalaBook = ScalaCom("Learning Scala", 1111)
  val sparkBook = ScalaCom("Learning Spark", 2222)

println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%")

  println("\nStep 4: How to call function on each ScalaCom object")
  scalaBook.print
  sparkBook.print
  
}