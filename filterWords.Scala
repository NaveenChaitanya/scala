/*"Filter out all the word which does not have "spark" regradless of upper or lower case
("We", "Are" ,"Learning" , "spark" , "From" , "InceptezSpark" , "We", "Are" ,"Learning" , "Spark" , "From" , "Inceptez.com" , "hadoop" , "SPARK")" 

*using List Partition method*/

package com.scala.workout

object separateSparkWords extends App{
  var words =List("We", "Are" ,"Learning" , "spark" , "From" , "InceptezSpark" , "We", "Are" ,"Learning" , "Spark" , "From" , "Inceptez.com" , "hadoop" , "SPARK")
  //using partition
  *var l =words.partition(x => x.toUpperCase().contains("SPARK"))._2*
  println(l)
  //using filter
  var lst =words.filter(x => !(x.toUpperCase().contains("SPARK")))
  println(lst)
  
  
}
