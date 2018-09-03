package com.technogeeks.scala.oo.m3

object EscapeCharacter extends App{
  
  println("Step 1: How to escape a Json String")
  // the below will give an error leading to improper format
//  val bookJson: String ="{"book_name":"Scala","read_level":"Very Good","price":2.50}"


  println("\nStep 2: Using backslash to escpae quotes")
  val bookJson2: String = "{\"book_name\":\"Scala\",\"read_level\":\"Very Good\",\"price\":2.50}"
  println(s"bookJson2 = $bookJson2")



  println("\nStep 3: Using triple quotes \"\"\" to escape characters")
  val bookJson3: String = """{"book_name":"Scala","read_level":"Very Good","price":2.50}"""
  println(s"""bookJson3 = 
                $bookJson3""")


  println("\nStep 4:  Creating multi-line text using stripMargin")
  val bookJson4: String =
    """
      |{
      |"book_name":"Scala",
      |"read_level":"Very Good",
      |"price":2.50
      |}
    """.stripMargin
  println(s"bookJson4 = $bookJson4")



  println("\nTip:  stripMargin using a different character")
  val bookJson5: String =
    """
      #{
      #"book_name":"Scala",
      #"read_level":"Very Good",
      #"price":2.50
      #}
    """.stripMargin('#')
  println(s"bookJson5 = $bookJson5")
  
  println("\nTip:  Without stripMargin using a different character")
  val bookJson6: String =
    """
      |{
      |"book_name":"Scala",
                        |"read_level":"Very Good",
      |"price":2.50
      |}
    """.stripMargin
  println(s"bookJson6 = $bookJson6")
  
}