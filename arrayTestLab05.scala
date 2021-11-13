package com.practice
import scala.io.StdIn._
import Array._
object arrayTestLab05 extends App {
  
  var arrInt =Array (1,2,3)
  for (a <- arrInt) print (a +  " ")
  //Append 1 element
    arrInt = arrInt :+ 50
    println( "\nAfter append the vlaue")
  for (a <- arrInt) print (a +  " ")
 //Append two elements
  arrInt=arrInt ++ Array(8,10)
  println("\nappend multiple values:")
  for (a <- arrInt) print (a +  " ")
  
  //prepend values
  println("\nPrepend values:")
  arrInt = 3 +: arrInt
  for (a <- arrInt) print (a +  " ")
  
  
  //prepend multiple values:
  println("\nPrepend multiple vlaues")
  arrInt = Array(4,9) ++: arrInt
  for (a <- arrInt) print (a +  " ")
}