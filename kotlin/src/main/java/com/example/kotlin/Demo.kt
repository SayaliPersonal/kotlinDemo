package com.example.kotlin
//https://kotlinlang.org/
fun main() {
    println("1.Inline function")
    println("2.Extennsion function")
    println("3.Operator overloading")
    println("4.Constructor")
    println("5.Inheritance")
    println("6.Higher order function")
    println("7.Data classes")
    println("8.inFix function")
    println("9.Object declaration & compnaion")
    println("10.FromFuture ")
    println("11.Flowable ")
    println("Enter choice:")
    val (a) = readLine()!!.split('\n')
    val x: Int? = a.toInt()
    when (x) {
        1 -> {
            val result = inLineFunct(4, 5)
            print(result)
        }
        2 -> {
            println("Extension function it means addition of new functions to outside of that particular class, it avoid changes in original code")
            var m1 = MyClass()
            m1.skill = "java";
            m1.show()

            var m2 = MyClass()
            m2.skill = "Kotlin";
            m2.show()

            var m3 = m1.extnsionFunction(m2)
            m3.show()
        }
        3 -> {
            println("Operator Overloading: Kotlin has some predefined set of operator using  that we cane perform operation")
            var m1 = MyClass()
            m1.skill = "java";
            m1.show()

            var m2 = MyClass()
            m2.skill = "Kotlin";
            m2.show()

            var m3 = m1 + m2
            m3.show()
        }
        4 -> {
            println("Primary constructor:In which prameters are  attached to class name itself & with the help of init block we can perform operations")
            var m2 = MyClass("Primary constructor")
            println("Secondary constructor:In which prameters are  attached to using constructor modifier, for this we need to attached primary constructor compolsoury")
            var m3 = MyClass("Secondary constructor","2")
        }
        5 -> {

        }
        6 -> {
            println("  Higher order function: in which we can take function as input & return out put as function\n" +
                    "            Inshore here function is use as parameter function\n  Lamdas:\n" +
                    "            Function which has no name\n" +
                    "            Normal function sumFunction(a: Int, b: Int)\n" +
                    "            {\n" +
                    "                Return: a+ b\n" +
                    "            }\n" +
                    "            lamda Ex: val sum = {a: Int, b: Int -> a+b}\n" +
                    "\n" +
                    "            syntax= val variable= {input parameter -> operation }\n" +
                    "            OperatorTypes().map();")
        }
        7 -> {
            println("Data classes specify with data keyword, it provide functionality which is specific to data\nIt has bydefault toString() method")
            val myInfo=Info("Sayali",29)
            println(myInfo)
        }
        8 -> {
            println("infix functions on the other are used to call functions without parentheses or brackets. Doing so, the code looks much more like a natural language.")
            var m1 = MyClass()
            m1.skill = "java";
            m1.show()

            var m2 = MyClass()
            m2.skill = "Kotlin";
            m2.show()

            var m3 = m1 infixFunxtion m2
            m3.show()
        }
        9 -> {
       CompanionDemo.show()
    }
//    11 -> {
//        OperatorTypes().flowable();
//    }
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
}

fun inLineFunct(a: Int, b: Int): Int = a + b

fun MyClass.extnsionFunction(m2:MyClass): MyClass
{

    var m=MyClass()
    m.skill=this.skill+","+m2.skill
  return m;
}

infix fun MyClass.infixFunxtion(m2:MyClass): MyClass
{

    var m=MyClass()
    m.skill=this.skill+","+m2.skill
    return m;
}
operator fun MyClass.plus(m2:MyClass): MyClass
{

    var m=MyClass()
    m.skill=this.skill+","+m2.skill
    return m;
}

data class Info(val name:String ,val age: Int)
{

}