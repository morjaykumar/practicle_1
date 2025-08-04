fun main(){
    print("enter any number:")
    val a=readln().toInt()
    val b=fact(a)
    println("factorial of $a=$b")
}
fun fact(a:Int):Int {
    if (a == 0 || a == 1) return 1
    else return a*fact(a-1)


}
