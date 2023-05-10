fun main() {
    getNames("ruth","awino","odida")

}

fun manipulateArray() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)

    println(numbers[1] + numbers[4])

    // (ii) prints out the index of 158
    println(numbers.indexOf(158))

    numbers.sort()
    println(numbers.contentToString())
}
//
//2. Given a list of Person objects, each with the attributes, name, age, height, and weight.
//Sort the list in order of descending age (2 points)


//
//3. Create a function that takes in 3 names and returns a string array
//containing all 3 names. (2 points)

fun getNames(name1: String, name2: String, name3: String): Array<String> {
    return arrayOf(name1, name2, name3)
}

//
//4. Write a function that takes in a list of Car objects
//each with a registration and mileage attribute and returns the average
//mileage of all the vehicles in the list. (3 points)

data class  Car(val registration: String,val mileage:Double)
fun calculateAvg() :Double{
    var vehicleone = Car("KWZ4", 1000.0)
    var vehiclestwo = Car("PZG5", 2000.0)
    var vehiclestthree = Car("GLP9", 3000.0)

    var vehicles = listOf(vehicleone, vehiclestwo, vehiclestthree)
    var totalMilaeage = 0.0
    for (vehicle in vehicles) {
        totalMilaeage += vehicle.mileage


    }
    var average = vehicles.size
    var new = totalMilaeage / average
    return new
}



