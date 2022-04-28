fun main() {
    println("Hello");println("123123")
    // val
    // var
    /*
    val age: Int
    age = 32
    println(age)
     */
    //val age: Int  = 23

    //println(age)
    //age = 25
    //age = 26
/*
    var city: Int
    city = 456
    println(city)
    city = 123
    println(city)

    val a: Byte = -10 // -128 - 127
    val b: Short = 45
    val d: Long = 30000
*/
    //val c: UInt = 250U

   // val height: Double = 1.78
   // val pi: Float = 3.14F


    val dd: Double = 23e3
    println(dd)

   // val height: Double = "1.78"
    var name: Any = 23
    println(name)

    val x = 11
    val y = 5
    val z = x/y
    println(z) // 2

    val x2 = 11
    val y2 = 5.0
    val z2 = x/y // 2.2

    val a = 11
    val b = 12
    val c = a < b
    println(c)

    val p = 5
    val m = p in 1..6 // true

    val flag = true
    when(flag) {
        false -> println("false")
        true -> println("true")
        else -> println("None!")
    }

    val pp: Any? = null
    println(pp)

    val sum = 100

    val result = when(sum) {
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }

    var d = 10

    when (d) {
        10 -> {
            println("d=10")
            d = d*2
        }
        15 -> {
            println("d=15")
            d *= 5
        }
    }

    for(n in 1..9) {
        print("${n * n} \t")
    }

    val range = 1..5 // диапазон [1,2,3,4,5]
    println("${range::class.simpleName}")

    val numbers: Array<Int> = arrayOf(1,23,4,5)
    var tt: Array<Any> = arrayOf("AA","BB")
    var bb = arrayOf(5,6)
    for(nums in bb) {
        print("$nums \t")
    }






}