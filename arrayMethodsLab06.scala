package com.practice
import Array._
import scala.io.StdIn._
object arrayMethodsLab06 extends App{
  
  var a =Array(1,2,3,4,5,2,4,5,6,7,8,1,2,10)
  println("Arrya vlaues")
  for (i <- a) print(i + " ")
  //Array values :1,2,3,4,5,2,4,5,6,7,8,1,2,10)
  var b =a.distinct
  
  println("\nDistinct array elements")
  for (i <- b) print(i + " ")
  // values: 1 2 3 4 5 6 7 8 10 
  
  println(" ")
  val c =a.drop(5)
  // drop (2)  -- drops fist two elements.
  println("Drop elemnet (2) ")
   for (i <- c) print(i + " ")
   
   val d =a.dropRight(2) 
   println("\nDrop elements from right")
    for (i <- d) print(i + " ")
   
    println("dropwhile")
    val e =a.dropWhile(_< 5)
   println("\nDrop elements <5")
    for (i <- e) print(i + " ")
    
    println("\nfilter element >8")
    val f  =a.filter(_ > 8) 
    for (i <- f) print(i + " ")
    
   println("\nfind ")
        val g  =a.find(_ > 8) 
    print(g)
    
    println("\nhead of the array:" + a.head)
    println("last element:" +a.last)
   
    //print all elements except last element
    println("Init; print elements except last")
     val h  =a.init
     for (i <- h) print(i + " ")
     
     //intersect 
     val intsec =a.intersect(Array(1,5,8,20,50))
     println("\nIntersect Array")
     for (i <-intsec ) print(i + " ")
    println("\nSlice the array elements from 2 to 4")
    val s= a.slice(2,4)
    for (i <-s ) print(i + " ")
    
    println("\nprint first n elements")
    for (i <- a.take(8)) print(i + " ")
    println("\nprint last(right) n elements")
    for (i <- a.takeRight(8)) print(i + " ")
        
    println("\nPrint predicate elements")
    for (i <- a.takeWhile(_ < 8)) print(i + " ")
}