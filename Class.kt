///Class
class Car(val name: String, val type: String, var kmRun: Int) {
    fun driveCar() {
        println("$name Car is Driving")
    }

    fun applyBrakes() {
        println("$name Applied Brakes")
    }
}

fun main() {
    val maruti = Car("Maruti 800", "Petrol", 789)
    val sentro = Car("Sentro 400", "Diesel", 90000)
    println(maruti.name)
    println(maruti.type)
    println(maruti.kmRun)
    maruti.applyBrakes()
    maruti.driveCar()
    println(sentro.name)
    println(sentro.type)
    println(sentro.kmRun)
    sentro.driveCar()
    sentro.applyBrakes()
}
