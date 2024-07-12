package com.example.ex1

fun proc(s: String, op: (String) -> String): String {
    return op(s)
}

fun upperCase(s: String) = s.uppercase()
fun lowerCase(s: String) = s.lowercase()

fun main() {
    val upperCaseName = proc("John", ::upperCase)
    val lowerCaseName = proc("John", ::lowerCase)
    println("upperCaseName $upperCaseName, lowerCaseName $lowerCaseName")
}