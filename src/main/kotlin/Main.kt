fun main() {
    addition(30,20)
    studentDetels("Susan",24,"AkiraChix")
    citizenship("Lucy",23,"Kenya")
    println( sumNumbers(34,20,50,10))
    val avg = averageNumbers(10.0,30,20.2,40,12.5)
    println("The average is $avg")
    var name ="Ann Anyango"
    println(name)
    var age :Byte = 20
    println( age)
    var phonenumber : String = "0701852120"
    println(phonenumber)
    val  weight =64
    var citizenshipkenya:Boolean =true
    println(citizenshipkenya)




}
fun addition(num1:Int,num2:Int){
    var numbers=num1 /num2
    println(numbers)

}
fun studentDetels(name:String,age:Int,school:String){
    var pupil=("Hello $name I am $age I am in $school")
    println(pupil)

}
//1. Create and invoke a function that takes in a users
// name, age, and nationality and prints out “Hello my name
// is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out
// “Hello my name is Lucy, I am 23 years old
// and I am from Kenya” (2 points)
 fun citizenship(name: String,age:Int,nationality:String){
     println("Hello my name is $name,i am $age and from $nationality")

 }
//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun sumNumbers(num3:Int,num4:Int,num5:Int,num6:Int):Int{
    var numbers=num3+num4+num5+num6
    return numbers

}
//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun averageNumbers(numb1:Double,numb2:Int,numb3:Double,numb4:Int,numb5:Double):Double{
    return numb1+numb2+numb3+numb4+numb5

}
//You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
fun personRecord ( fullname:String,  age:Int,  phonenumber:String,  email:String,  weight:Double,  isUgandan:Boolean){
}





