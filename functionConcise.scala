package com.practice
import scala.io.StdIn._
object functionConcise extends App{
  
  
  //function to check odd number exist in List elements
  def checkOdd(arg: List[Int]):Boolean=
  {
    var exist =false
    for(num <- arg)
    {
      if(num%2==1)
        exist=true
        
    }
    exist
  }
  
  
  println("Check the odd num exist in List:  "+ checkOdd(List(1,2,30,40,5)))
  
  
  // same function can be written as follows
  
  def checkOddNum(arg:List[Int]) = arg.exists(_ %2 ==1) 
  
  println("Check the odd num exist in List(Concise) :  "+ checkOddNum(List(1,2,30,40,5)))
  
 val l =List("one","two","three")
 val l1 =List(1,2,3,4,5)
 
 println((""/: l) (_ +  "	" + _))
 println((l.head /: l.tail)(_ + "," +_))
 println((l :\ " ")(_ + "," +_))
   
}