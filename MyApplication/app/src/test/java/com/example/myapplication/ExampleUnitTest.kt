package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*
import java.util.Scanner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
//class ExampleUnitTest {
//    @Test
//    fun addition_isCorrect() {
//        assertEquals(4, 2 + 2)
//    }
//}
data class Person(val name: String, val age: Int)
fun main(){
    val name="Ainsh"
    println("Hello $name")

    val persons= listOf(Person("Anish",21),
                        Person("Anish",21),
                        Person("Anish",23),
                        Person("Anish",23),
                        Person("Priya",21))

    //println(persons.groupBy { it.name })

//    val newPerson=persons.associate { it.name to it.age }
//    println(newPerson)
//    val newPerson1=persons.associateBy { it.name }
//    println(newPerson1)
    val s=Scanner(System.`in`)
    val a= mutableListOf<Int>()
    //val b= mutableListOf<Int>()
    for(i in 1..10){
        a.add(s.nextInt())
        //b.add(s.nextInt())
    }
    //val map:Map<String,Int> =a.associate { it.toString()+"*2" to it*2 }
    println(a.zipWithNext())

    val list = listOf(1, 2, 3)
    val flatMappedList = list.flatMap { listOf(it, it * 2) }

    println(flatMappedList) // Output: [1, 2, 2, 4, 3, 6]


}