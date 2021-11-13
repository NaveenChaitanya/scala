package com.practice
import scala.io.StdIn._
object frequencyOfElements extends App {
  val l = List(10, 2, 3, 50, 3, 40, 50, 10, 20, 3, 5, 60, 3, 50, 10, 5, 20, 10, 40, 30, 10)
  println(s"List Values:" + l)

  for (i <- l.sorted.distinct) {
    //print(s"\n$i :${l.filter(s => s == i).length}")
    print(s"\n$i :${l.filter(_ == i).length}")
    if (l.filter(s => s == i).length>=2) print("- Duplicate")
    
    
  }
l.foreach(print )


def printMsg(args: String*)
{
  args.foreach(println)
}
println("\nPrinting messages")
printMsg()
printMsg("Hello")
printMsg("Hello", "Good Morning")
printMsg("Hello", "Good Morning","How are you?")

val arr = Array("Hello","Good Morning","How are you?")
printMsg(arr: _*)

}