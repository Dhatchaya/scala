object Q3 extends App{
    case class Car(Name:String,price:Double)
    case class Caruuid(car:Car){
        def createuuid():String= s"car uuid = ${car.Name} - ${car.hashCode()}"
    }
    object definecars{
        implicit def createuuid(car:Car):Caruuid = Caruuid(car)
    }
    import definecars._
    val bmw3 = Car("bmw 3 series", 20000)
    val bmw5 = Car("bmw 5 series", 50000)
    val vwPassat = Car("vw passat", 10000)
    val vwGolf = Car("vw golf", 12000)
    val mazda3 = Car("mazda 3", 15000)

   val cars = List(bmw3, bmw5, vwPassat, vwGolf, mazda3)
   cars.foreach(cars=>println(cars.createuuid))

}
