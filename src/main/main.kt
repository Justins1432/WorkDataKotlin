package main

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val eventDateFrom = "2022-02-26T11:00:00Z"
    val eventDateTo = "2022-02-26T19:59:00Z"
    var simpleDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    val dateEventFrom: Date = simpleDateFormat.parse(eventDateFrom)
    val dateEventTo: Date = simpleDateFormat.parse(eventDateTo)
    simpleDateFormat = SimpleDateFormat("dd-MM-yyyy hh:mm:ss")
    val formatStringEventFrom: String = simpleDateFormat.format(dateEventFrom)
    val formatStringEventTo:String = simpleDateFormat.format(dateEventTo)
    println("C $formatStringEventFrom по $formatStringEventTo")
}