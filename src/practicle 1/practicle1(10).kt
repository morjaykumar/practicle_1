class Car(
    val company: String,
    val model: Int,
    val price: Double,
    val owner: String,
    var milesDriven:Int,
){
    init {
        println("Object of class is created and Init called. ")
    }
    fun getCarInfo(){
        println("Car Information: Company:  $company, model: $model")
        println("Car Owner: $owner")
        println("Miles Driven: $milesDriven")
    }
    fun getOriginalPrice(): Double{
        return price
    }
    fun getCurrentPrice(): Double{
        return price -(milesDriven*0.1)
    }
    fun displayCarDetails(){
        getCarInfo()
        println("Original Car Price: ${getOriginalPrice()}")
        println("Current car Price: ${getCurrentPrice()}")
        println("---------")
    }
}
fun main(){
    val car1 = Car("BMW",2018,100000.0,"Aman",105)
    car1.displayCarDetails()

    println("Creating car class object car2 in next line")
    val car2 = Car("BMW",2019,400000.0,"karan",20)
    car2.displayCarDetails()

    println("************ ArrayList of Car ************")
    var carList = arrayListOf<Car>(
        Car("Toyota",2017,1080000.0,"KJS",100),
        Car("Maruti",2020,400000.0,"NPP",200)
    )
    for(car in carList){
        car.displayCarDetails()
    }
}
