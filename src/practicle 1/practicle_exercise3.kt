package `practicle 1`

open class Person(
    var firstName: String,
    var lastName: String,
    var age: Int
) {
    constructor(firstName: String, lastName: String) : this(firstName, lastName, 18)
}

class Student(
    firstName: String,
    lastName: String,
    age: Int,
    var enrollmentNo: String,
    var branch: String,
    var className: String,
    var labBatch: String
) : Person(firstName, lastName, age) {

    constructor(firstName: String, lastName: String) : this(
        firstName, lastName, 18,
        "not assigned", "not assigned", "not assigned", "not assigned"
    )

    override fun toString(): String {
        return "Name: $firstName $lastName, Age: $age, " +
                "Enrollment No: $enrollmentNo, Branch: $branch, " +
                "Class: $className, Batch: $labBatch"
    }
}

fun main() {
    val students = listOf(
        Student("Raval", "Dev", 19, "23012011101", "Computer Science", "B", "2"),
        Student("Rathod", "Digvijay", 20, "23012011099", "Computer Science", "B", "2"),
        Student("Rohan", "Verma", 19, "23012011003", "Mechanical Engineering", "B", "1"),
        Student("Priya", "Nair", 22, "23012011004", "Civil Engineering", "A", "3"),
        Student("Karan", "Gupta", 20, "23012011005", "Information Technology", "C", "4")
    )
    students.forEach { println(it) }
}
