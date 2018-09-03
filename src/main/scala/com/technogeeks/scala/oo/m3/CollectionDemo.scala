package com.technogeeks.scala.oo.m3

object CollectionDemo extends App{

  //Tuple
  val items = (1,"string",()).productIterator
  items.foreach(print)

  val keyvalue = ("name" -> "sunny","city" -> "Mumbai")

  keyvalue.productIterator.foreach(println)

  def info = keyvalue

  val(name,city) = keyvalue

  println(name)

  ////Immutable

    //SETS
  val fruits = Set("peas","apple")
  println(fruits("apple"))
  val newfruit = Set("papaya") ++ fruits
  println(newfruit -- fruits)

}
