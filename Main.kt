fun main() {

    val myList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("the average  of the list is : ${myList.let {
        it.sumOfNumbers() / it.size
    }}")
    println(" sum of the numbers in the list : ${myList.sumOfNumbers()}")
    println(" the odd numbers of the list:  ${myList.oddNumbers()}")
    println("the even numbers is the list : ${myList.evenNumbers()}")
    println(" squared numbers : ${myList.squareNumbers()}")

}

fun List<Int>.sumOfNumbers(): Int {
    return this.sum()
}

//------------------------------------------------------------
fun List<Int>.oddNumbers(): List<Int> {
    val oddNumbers = mutableListOf<Int>()
    for (i in listIterator()) {
        if (i % 2 != 0) {
            oddNumbers.add(i)
        }
    }
    return oddNumbers
}

//------------------------------------------------------------
fun List<Int>.evenNumbers(): List<Int> {
    val evenNumbers = mutableListOf<Int>()
    for (i in listIterator()) {
        if (i % 2 == 0) {
            evenNumbers.add(i)
        }
    }
    return evenNumbers
}

//-------------------------------------------------------------
fun List<Int>.squareNumbers(): List<Int> {
    val squaredList = mutableListOf<Int>()
    for (i in listIterator()) {
        squaredList.add(i * i)
    }
    return squaredList
}

