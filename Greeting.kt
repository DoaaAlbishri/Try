fun main(){
    // this code without bonus question
    print("Enter your name:  ")
    val name = readLine()
    println("Hello $name, welcome to my program")

    // this code with bonus question
    println("\nBonus question")
    print("Enter your name:  ")
    val name1 = readLine()
    var printStmt="Hello user, welcome to my program"
    println(printStmt.replace("user","$name1"))
}