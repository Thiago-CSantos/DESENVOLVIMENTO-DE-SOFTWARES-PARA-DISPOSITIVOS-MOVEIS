package org.aula23_08

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.net.http.HttpResponse.BodyHandler


fun main() {

    println("Escreva um titlo de filme");
    var leitor = readln().toString();

    if(!leitor.isNullOrEmpty()){
        val chave: String = "d642b621"
        val client: HttpClient = HttpClient.newHttpClient();
        val request: HttpRequest = HttpRequest.newBuilder()
            .uri(URI.create("http://www.omdbapi.com/?t=${leitor}&y=&apikey=" + chave)).build();

        val response = client.send(request, HttpResponse.BodyHandlers.ofString());

        var a:String = "";

        for (item in 0..response.body().length){
            if(response.body()[item]){

            }
            println()
        }

        println(a);
    }




}