fun main() {
    val num = arrayOf(1, 2, 3, 4,-10)
    var a=num.size
    println(a)
    var min=num[0]
    for (i in 0..a-1 step 1)
    {
        println(i)
        if(num[i]<min)
            min=num[i]
    }
    println("minimum score is $min")
}