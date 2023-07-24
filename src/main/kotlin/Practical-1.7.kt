fun main() {
    println("Enter your number:")
    val v: Int = readLine()!!.toInt()

    val result = multiplyNumbers(v)
    println("Factorial of $v is: $result")
}

fun multiplyNumbers(v: Int): Long {
    return if (v >= 1)
        v.toLong() * multiplyNumbers(v - 1)
    else
        1
}
