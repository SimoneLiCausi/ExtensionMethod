fun main(args: Array<String>) {

    val myList = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000)
    val myFilteredList = myList.filterMyNumber()
    println("My number list is: ${myList}")
    println("My filter number list is: ${myFilteredList}")
}

fun List<Int>.filterMyNumber(): List<Int> {
    return this.filter { number -> number <= 500 }
}