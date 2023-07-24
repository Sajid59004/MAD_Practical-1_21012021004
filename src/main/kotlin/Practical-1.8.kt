fun main(){

    println("Array created by using arrayof() method")
    var a = arrayOf(23,43,5,63,8)
    println(a.contentToString())

    println("Array created by using Array<>  method")
    var b = Array(5){0}
    println(b.contentDeepToString())

    println("Array created by using Array<> and Lambda function")
    var c = Array(7){i->i}
    println(c.contentToString())

    println("Array created using IntArray()")
    var d = IntArray(5){7}
    println(d.joinToString (", "))

    println("Array created using IntArrayOf()")
    var e = intArrayOf(12,54,64,67,2)
    println(e.joinToString(", "))

    println("Array created by using arrayof() and intArrayOf()")
    var f = arrayOf(intArrayOf(45,3), intArrayOf(4,1), intArrayOf(9,2))
    println(f.contentDeepToString())

    print("Enter number of Elements : ")
    val size : Int = readLine()!!.toInt()
    val user = IntArray(size) {0}


    for(i in 0 until size)
    {
        print("a[$i]:")
        user[i] = readLine()!!.toInt()
    }
    print("Entered Array = ")
    println(user.contentToString())

}