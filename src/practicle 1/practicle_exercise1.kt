package `practicle 1`

fun main(){
    println("With using Third Variable: ")
    println("Before Swapping: ")
    var a =10
    var b= 20
    println("The Value of a is $a and Value of b is $b")
    val temp = a
    a = b
    b = temp
    println("After Swapping: ")
    println("The value of a is $a and value of b is $b")
    println("***************************")
    println("Without using Third Variable: ")
    println("Before Swapping: ")
    var x=10
    var y=20
    println("The Value of x is $x and Value of y is $y")
    x = x+y
    y= x-y
    x=x-y
    println("After Swapping: ")
    println("The value of x is $x and value of y is $y")
}
