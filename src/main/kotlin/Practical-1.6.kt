fun main(){
    println("Enter first number")
    var a = readLine()!!.toDouble()

    println("Enter second number")
    var b = readLine()!!.toDouble()

    fun add( a: Double, b:Double ): Double{
        return a + b;
    }
    println("your sum is:"+ add(a,b))

    fun sub ( a: Double, b: Double): Double{
        return a - b;

    }
    println("your sub is :"+ sub(a , b));

    fun mul (a : Double, b: Double):Double{
        return a * b;
    }
    println("your mulplication is : "+ mul(a,b));

    fun div ( a: Double, b: Double ): Double {
        return a / b;
    }
    println("Your division is:"+ div(a,b));
}