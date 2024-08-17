package com.example.myapplication

fun main(){
    val name = "Kotlin";
    println("Hello World");

    val list: List<String> = listOf("Jhola", "Primer", "AutoBos");

    for (i in 1..5 ){
        println("i = $i");
    }

    for (i in list ){
        println("i = $i");
    }

    val myInput = readln().split(',').map {
        it.toDouble()
    }
    val input = readln().toIntOrNull();

    println(input);

}