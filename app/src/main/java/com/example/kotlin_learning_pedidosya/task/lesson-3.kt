package com.example.kotlin_learning_pedidosya.task

class Lesson3 {
    // 1. Basic Inheritance and Polymorphism
    open class Animal(val name: String) {
        open fun makeSound() {
            // TODO: Print "The animal makes a sound"
            println("The animal makes a sound")
        }
    }

    class Dog(name: String) : Animal(name) {
        override fun makeSound() {
            // TODO: Print "$name barks"
            println("$name barks")
        }
    }

    // 2. Collections in Kotlin
    fun collectionOperations() {
        val numbers = mutableListOf(1, 2, 3, 4, 5)
        // TODO: Add the number 6 to the list
        // TODO: Remove the number 2 from the list
        // TODO: Use map to double the values
        // TODO: Use filter to get only odd numbers

        numbers.add(6)
        numbers.removeAt(1)

        println(numbers)

        val doubleNumbers = numbers.map { it * 2 }
        val evenNumbers = doubleNumbers.filter { it % 2 == 0 }

        println("Double numbers: $doubleNumbers, Even numbers: $evenNumbers")
    }

    // 3. Data classes and destructuring
    data class Person(val name: String, val age: Int)

    fun dataClassExample() {
        val person1 = Person("Juan", 30)
        // TODO: Create a copy of person1 with a different name
        // TODO: Compare person1 with its copy
        // TODO: Use destructuring to get name and age

        val person2 = person1.copy("Andy")
        println("person 1 is equals person2: ${person1.equals(person2)}")

        val (name, age) = person1
        println("name: $name, age: $age")

    }
}

fun main() {
    val exercises = Lesson3()
    val dog = Lesson3.Dog("Firulais")
    dog.makeSound()

    // Collections
    exercises.collectionOperations()

    // Data classes and destructuring
    exercises.dataClassExample()
}