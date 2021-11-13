package com.practice
import scala.io.StdIn._
object ListLab01 extends App {
  //list declaration
  val automobile = List("Maruti", "Hyundai", "Honda", "Tata", "Mahindra", "Skoda", "Ford", "Renault", "Toyota", "Nissan")

  //foreach iteration
  automobile.foreach(s => println(s))
  //convert list array
  var arr_auto = automobile.toArray
  arr_auto.foreach(s => println(s))

  //List operations.
  val l = List() //declaration of empty list
  println("Is List 'L' empty:" + l.isEmpty)

  val l1 = List(1, 2)
  val l2 = List(3, 4)

  var l3 = l1 :: l2
  l3.foreach(l => print(l + " ")) //output List(1, 2) 3 4

  println("")
  val l4 = l1 ::: l2
  l4.foreach(l => print(l + " ")) //List(1,2,3,4)

  //print second element - list(index) idx start from 0

  println("\nSecond element from list:" + automobile(1))

  //elements count
  println("Elements in list:" + automobile.length)

  //drop an element @ position
  val l5 = l1.drop(1)
  println(l5)

  val l6 = l1.dropRight(1)
  println(l6)

  println("Is Maruti exist in list:" + automobile.exists(s => s == "Maruti"))

  //reverse list elements
  val l7 = automobile.reverse
  println("Reverse List elements" + l7)

  //sort elements
  val l8 = automobile.sorted
  println(l8)

  //print first element
  println(l8.head) //# Fort
  //print all except first
  println(l8.tail) //List(Honda, Hyundai, Mahindra, Maruti, Nissan, Renault, Skoda, Tata, Toyota)

  //print all elements except last
  println(l8.init) //# List(Ford, Honda, Hyundai, Mahindra, Maruti, Nissan, Renault, Skoda, Tata)

  //concat separator string to each element
  println(l8.mkString("|")) // # Ford|Honda|Hyundai|Mahindra|Maruti|Nissan|Renault|Skoda|Tata|Toyota

  var lt =List.tabulate(6)( n => n*n)
  println(lt)
  
  val lt1=List.tabulate(4, 5)(_ *_)
  println(lt1)
}