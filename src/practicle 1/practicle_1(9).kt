fun main(){
    println("Enter the size of ArrayList: ")
    val size = readln().toInt()
    val numbers = ArrayList<Int>()


    println("Enter $size values: ")
    for (i in 0 until size){
        print("a[$i] = ")
        val value = readln().toInt()
        numbers.add(value)
    }
    println("\nEntered ArrayList:")
    println(numbers.joinToString (prefix = "[", postfix = "]"))
    val maxValue = numbers.maxOrNull()
    if(maxValue!=null){
        println("Maximum number in the ArrayList is: $maxValue")
    }else{
        print("The ArrayList is empty");
    }
}
