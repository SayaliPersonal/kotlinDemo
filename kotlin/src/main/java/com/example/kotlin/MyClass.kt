package com.example.kotlin

class MyClass(name: String=""){
    init {
        println(name+" is executed")
    }

    constructor(name: String, number:String):this(name)
    {
        println(name+" is executed after primary $number time")
    }
    var skill:String?= null
    fun show()
    {
        println(skill)
    }
}