import java.util.*

fun main()
    {
        printing()
        name()
        name2()
        perimeter()
        differenceing()
        odd()
        day();
        sum()
        printPattern()
        score()
        div()
    }

fun div() {
    println("Enter a number")
    val read=Scanner(System.`in`)
    var a=read.nextInt()
    if (a%5==0) println("div by 5")else println("Not div by 5")
}

fun score() {
    val num = arrayOf(1, 2, 3, 4,-10)
    var a=num.size-1
    var min=num[0]
    for (i in 0..a step 1)
    {
        if(num[i]<min)
            min=num[i]
    }
    println("minimum score is $min")
}

fun printPattern() {
    for (i in 1..3 step 1)
    {
        for (j in 1..i step 1)
            println(""+i+"."+j)
    }
}

fun sum() {
    val read=Scanner(System.`in`)
    println("enter summ number")
    var a=read.nextInt()
    var  summ=0
    for (i in 0..a step 3){
        summ+=i
    }
    println(summ)
}

fun day() {
    val read=Scanner(System.`in`)
    println("Enter day")
    var day=read.next()
    when(day)
    {
        "Sunday"-> println("Sun")
        "Monday"-> println("Mon")
        "Tuesday"-> println("Tue")
        "Wednusday"-> println("Wed")
        "Thursday"-> println("Thu")
        "Friday"-> println("Fri")
        "Satday"-> println("Sat")
    }
}

fun odd() {
    println("enter a number")
    val read=Scanner(System.`in`)
    var a=read.nextInt()
    if (a%2==1)
        println("odd")
    else
        println("even")
}

fun differenceing() {
    println("enter two number")
    var a=Integer.valueOf(readLine())
    var b=Integer.valueOf(readLine())
    println(a-b)
}

fun perimeter() {
     val read=Scanner(System.`in`)
     println("enter the side of square")
     var a=read.nextInt()
     println("perimeter is "+ (a*4))
 }

 fun printing()
    {
        println("Masai School")
    }
    fun name()
    {
        var a="Barshed"
        println(a)
    }
    fun name2()
    {
        var a="Barshed"
        println(a)
        a="Jakir"
        println(a)
    }