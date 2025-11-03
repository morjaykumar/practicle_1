fun main() {
    var a: Int=25
    var b: Double=a.toDouble()
    println("integer to double=$b")
    var c: String="50"
    var d: Int=c.toInt()
    println("string to integer=$d")
    var e: Double=c.toDouble()
    println("string to double=$e")

       print("enter any number:")
        var f = readln().toInt()
        var g=true
        for (i in 2..f - 1) {
            if (f % i == 0) {

                g=false

            }


        }
    print(
        if(g==true)
        "prime"
        else
        "not prime"
    )



}