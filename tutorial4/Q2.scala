
object Q4 extends App{
    def evaluateNumber(num:Int):Any={
        num match{
            case num if num<=0 => println("Negative/Zero is input")
            case num if num %2==0 => println("Even number")
            case num if num%2 !=0 => println("Odd number") 
        }
    }
    print("Enter a number: ")
    evaluateNumber(scala.io.StdIn.readInt())
}

