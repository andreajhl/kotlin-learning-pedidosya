package com.example.kotlin_learning_pedidosya.task

class Lesson1 {

    // Exercise 1: Variables and data types
    // Complete the variables with the correct types
    fun exercise1() {
        // TASK: Declare an immutable variable (val) named name of type String
        val name: String = "Andy"

        // TASK: Declare a mutable variable (var) named age of type Int
        var age: Int = 26

        // TASK: Declare a nullable variable named address of type String
        var address: String? = "Buenos aires"

        // Print the variables here
        println("---- Exercise 1 ----")
        println("Name: $name, Age: $age, Address: ${address ?: "No address provided"}")
    }

    // Exercise 2: Mathematical operations
    // The results should be:
    // Sum = 15
    // Multiplication = 50
    // Division = 2
    fun exercise2() {
        val number1 = 10
        val number2 = 5

        val sum = number1 + number2
        val multiplication = number1 * number2
        val division = number1 / number2

        println("---- Exercise 2 ----")
        println("Sum: $sum, Multiplication: $multiplication, Division: $division")
    }

    // Exercise 3: Relational operators
    // Complete the comparisons so that all return true
    fun exercise3() {
        val a = 10
        val b = 20

        val comparison1 = a < b
        val comparison2 = a != b
        val comparison3 = b >= a

        println("---- Exercise 3 ----")
        println("Comparisons: $comparison1, $comparison2, $comparison3")
    }

    // Exercise 4: Flow control with if
    // Complete the function to classify age
    fun exercise4(age: Int) {
        println("---- Exercise 4 ----")
        // TASK: Implement an if-else structure that prints:
        // "Minor" if age < 18
        // "Adult" if age is between 18 and 65
        // "Senior" if age > 65
        val messageAge = when {
            age < 18 -> "Minor"
            age in 18..65 -> "Adult"
            else -> "Senior"
        }

        println("Age: $age, message: $messageAge")
    }

    // Exercise 5: Flow control with when
    // Complete the when to classify grades
    fun exercise5(grade: Int) {
        println("---- Exercise 5 ----")
        // TASK: Implement a when structure that prints:
        // "Excellent" if grade is between 9 and 10
        // "Good" if grade is between 7 and 8
        // "Pass" if grade is between 5 and 6
        // "Fail" if grade is less than 5
        val messageGrade = when {
            grade >= 9 -> "Excellent"
            grade >= 7 -> "Good"
            grade >= 5 -> "Pass"
            else -> "Fail"
        }

        println("Grade: $grade, message: $messageGrade")
    }

    // Exercise 6: Loops
    // Fix the loop to print numbers from 1 to 5
    fun exercise6() {
        println("---- Exercise 6 ----")
        for (i in 1 .. 5) {  // ERROR: Incorrect range
            println(i)
        }
    }

    // Exercise 7: Handling nullables
    // Complete the code to handle null values safely
    fun exercise7(text: String?) {
        println("---- Exercise 7 ----")
        // TASK: Use the Elvis operator (?:) to print the text
        // or "Empty text" if it's null

        println("Text: ${text ?: "Empty text"}")
    }

    // Exercise 8: While and logical operators
    // Complete the while loop to find the first number
    // that is divisible by 2 and by 3
    fun exercise8() {
        println("---- Exercise 8 ----")
        var number = 1
        // TASK: Implement a while loop to find the first number
        // divisible by 2 and by 3, starting from number = 1

        while (number % 2 != 0 || number % 3 != 0){
            number++
        }

        println("$number is divisible by 2 and by 3")
    }
}

// You can comment out the functions with double slashes (//) to test one by one
fun main() {
    val exercises = Lesson1()
    exercises.exercise1()
    exercises.exercise2()
    exercises.exercise3()
    exercises.exercise4(25)
    exercises.exercise5(8)
    exercises.exercise6()
    exercises.exercise7(null)
    exercises.exercise8()
}