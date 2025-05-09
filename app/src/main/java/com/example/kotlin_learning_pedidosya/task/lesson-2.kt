package com.example.kotlin_learning_pedidosya.task

class Lesson2 {

    // 1. Declaration and use of basic functions
    fun greet(name: String) {
        // TODO: Print "Hello, {name}!" using println
        println("Hello, $name!")
    }

    fun add(a: Int, b: Int): Int {
        // TODO: Return the sum of a and b
        return a + b
    }

    // 2. Inline and single-expression functions
    inline fun multiply(a: Int, b: Int) = a * b

    fun square(n: Int) = n * n // TODO: Convert this function to a one-line expression

    // 3. Introduction to lambdas and higher-order functions
    fun lambdaExample() {
        val numbers = listOf(1, 2, 3, 4, 5)
        // TODO: Use map to double the values in numbers and store it in a new list
        // TODO: Use filter to get only the even numbers
        val doubleNumbers = numbers.map { it * 2 }
        val evenNumbers = doubleNumbers.filter { it % 2 == 0 }

        println("Double numbers: $doubleNumbers, Even numbers: $evenNumbers")
    }

    // 4. Classes and objects
    class Person(private val name: String, private var age: Int) {
        // TODO: Add a method that prints "I am {name} and I am {age} years old"

        fun introduceYourself() {
            println("I am $name and I am $age years old")
        }
    }

    // 5. Constructors and encapsulated data
    class Car(val brand: String, val model: String, val year: Int) {
        init {
            // TODO: Print "Car created: {brand} {model} from year {year}"
            println("Car created: $brand $model from year $year")
        }
    }
}

fun main() {
    val exercises = Lesson2()
    exercises.greet("Gaston")
    println("Sum: ${exercises.add(3, 5)}")
    println("Multiplication: ${exercises.multiply(4, 2)}")
    println("Square: ${exercises.square(6)}")
    exercises.lambdaExample()

    val person = Lesson2.Person("Juan", 30)
    person.introduceYourself()

    Lesson2.Car("Toyota", "Corolla", 2022)
}