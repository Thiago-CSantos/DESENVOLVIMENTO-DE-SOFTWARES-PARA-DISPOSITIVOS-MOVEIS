package org.example

import java.util.function.Consumer

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

//    printSum(5,5);
//
//    val b = IntArray(5){
//        10*(it+1)
//    }
    // printVet(b)

    val c = Consumer();

    funcao2(1, arg3 = {
        val  a = "Hello"
        return@funcao2 a
    }, arg2 = 9)

}


fun funcao2(arg: Int = 0, arg2: Int =1, arg3: () -> String){
    println("Jhola: $arg e $arg2")
    println(arg3())
}

fun printSum(a:Int, b:Int):Unit{
    println("Sum ${a + b}, é soma de $a + $b")
}

fun sum2(a:Int, b:Int) = a+b;

fun sum(a:Int, b:Int): Int{
    return a + b;
}

fun printVet(b:IntArray, off: Int=0, len:Int = b.size){

    for (item in b){
        println(item)
    }

    println("Usando for com len $len")
    for(res in off..len-1){
        println(b[res])
    }

    println("Usando o Filter")
    var a = b.filter( { num -> num > 40 })

    for (item in a){
        println(item)
    }

}