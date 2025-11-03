fun main(){
    val add=addition(111,2222,-222)
    println("addition=$add")
    val sub=substract(111,2222,-222)
    println("substraction=$sub")
    val mul=multiplication(111,2222,-222)
    println("multiplication=$mul")
    val div=division(2222,111)
    println("division=$div")
}
fun addition(a: Int,b: Int,c: Int): Int{
   return a+b+c
}
fun substract(a:Int,b:Int,c:Int)=a-b-c
fun multiplication(a:Int,b:Int,c:Int)=a*b*c
fun division(a:Int,b:Int)=a/b