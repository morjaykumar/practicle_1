package `practicle 1`

import javax.print.attribute.standard.PrintQuality
open class Product(
    val productName :String,
    val quantity: Int,
    val amountPerQuantity : Double
)
{
    constructor(productName: String) : this(productName,0,0.0)
    constructor(productName: String,quantity: Int):this(productName, quantity ,0.0)
    fun displayProductInfo(){
        println("Product Name: $productName")
        println("Quality: $quantity")
        println("Amount Per Quantity: $amountPerQuantity")
    }
}
class Laptop(
    productName: String,
    quantity:Int,
    amountPerQuantity: Double,
    val cpu: String,
    val ram : String,
    val hdd:String,
):Product(productName, quantity,amountPerQuantity){
    constructor(productName: String,cpu: String,ram: String,hdd: String):this(productName,1,0.0,cpu,ram,hdd)
    fun displayLaptopInfo(){
        displayProductInfo()
        println("CPU: $cpu")
        println("RAM: $ram")
        println("HDD: $hdd")
        println("***************************")
    }
}
fun main(){
    val laptops = arrayListOf<Laptop>(
        Laptop("Dell Inspiron",5,55000.0,"Intel i5","8GB","512GB SSD"),
        Laptop("HP Pavilion",3,60000.0,"Intel i7","16GB","1TB HDD"),
        Laptop("Lenovo Thinkpad",2,75000.0,"AMD Ryzen 5","16GB","512GB SSD"),
        Laptop("Asus VivoBook",4,48000.0,"Intel i3","8GB","256GB SSD"),
        Laptop("Apple Macbook Air",1,95000.0,"Apple M1","8GB","256GB SSD"),
    )
    println("Laptop Inventory:")
    println("***************************")
    for(laptop in laptops){
        laptop.displayLaptopInfo()
    }
}
