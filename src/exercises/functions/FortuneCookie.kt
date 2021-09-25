package exercises.functions
fun getBirthday():Int{
    return readLine()?.toIntOrNull()?:0
}
fun getFortuneCookie():String{
    val fortunes= listOf<String>("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    println("Enter your birthday")
    var birthday:Int= getBirthday()
    return when (birthday)
    {
        28->fortunes[0]
        31->fortunes[0]
        in 1..7->fortunes[1]
        else-> fortunes[birthday%fortunes.size]
    }
}

fun main() {
    var fortune:String=getFortuneCookie()
    while(fortune.contains("Live life")) {
        if(fortune.equals("Take it easy and enjoy life!"))
        {
            println("Your fortune is ${fortune}")
            break
        }
        println("Your fortune is ${fortune}")
        fortune=getFortuneCookie()
    }
}