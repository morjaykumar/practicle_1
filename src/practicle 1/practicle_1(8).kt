fun main(){
    val array1 = arrayOf(10,90,60,80,100)
    val array2  = Array(5){0}
    val array3 = Array(8){it}
    val array4 = IntArray(5)
    val array5 = intArrayOf(12,10,1,5,18,19)
    val array6 = arrayOf(intArrayOf(1,3),intArrayOf(4,5),intArrayOf(6,7))


    println("Create Array-1 by using arrayOf() method: ")
    println(array1.joinToString(prefix = "[", postfix = "]"))
    println("\nCreate Array-2 by using Array<>(): ")
    println(array2.joinToString (prefix = "[", postfix = "]"))
    println("\nCreate Array-3 by using Array<> and lambda function")
    println(array3.joinToString (prefix = "[", postfix = "]"))
    println("\n Create Array-4 by using IntArray():")
    println(array4.joinToString (prefix = "[", postfix = "]"))
    println("\n Create Array-5 by using intArrayof():")
    println(array5.joinToString (prefix = "[", postfix = "]"))
    println("\n Create 2D Array-6 by using arrayof() and intarrayof():")
    println(array6.joinToString (prefix = "[", postfix = "]"){
        it.joinToString(prefix = "[", postfix = "]")
    })


    println("Please enter the size of array:")
    val size = readln().toInt()
    val a = IntArray(size);
    println("Please enter any ${size} Values: ")
    for (i in 0 until size){
        print("a[$i] = ")
        a[i] = readln().toInt();
    }
    println("Entered Array")
    print("[")
    for (i in 0 until size){
        print("${a[i]}")
        if (i != size-1){
            print(", ")
        }
    }
    print("]")
    println()
    println("*************With Built-in Function*************")
    val builtInSorted =a.copyOf()
    builtInSorted.sort()
    println("After sorting by built-in function:")
    println(builtInSorted.joinToString(prefix = "[", postfix = "]"))
    println("*************Without Built-in Function*************")
    println("Before Sorting:")
    println(a.joinToString(prefix = "[", postfix = "]"))
    val manualSorting = bubblesort(a.copyOf())
    println("\nAfter Sorting without built-in function:")
    println(manualSorting.joinToString(prefix = "[", postfix = "]"))


}


fun bubblesort(arr: IntArray): IntArray{
    val n = arr.size
    for (i in 0 until n){
        for (j in 0 until n-i-1){
            if(arr[j] > arr[j+1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    return arr
}






}