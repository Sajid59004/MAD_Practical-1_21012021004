fun main(){
    println("Enter number")
    var num = readLine()
    var V:Int=num!!.toInt()

    if (V%2==0)
        println("Number is Even")
    else
        println("Number is Odd")


}