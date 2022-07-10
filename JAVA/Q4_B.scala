object Q4_A{
  def main(args: Array[String]) = {

    println("Profit when ticket price is Rs.10 : "+ Profit(10))
    println("Profit when ticket price is Rs.15 : "+ Profit(15))
    println("Profit when ticket price is Rs.20 : "+ Profit(20))
    println("Best price : Rs."+ best_Price(10,15,20))

  }
def attendees(x:Int):Int =120+(15-x)/5*20
def earnning(y:Int):Int =attendees(y)*y
def Profit(x:Int):Int = earnning(x)-500-(attendees(x)*3)

def best_Price(x:Int,y:Int,z:Int):Int = if (Profit(x)>Profit(y)) if(Profit(x)>Profit(z)) x else z else if(Profit(y)>Profit(z)) y else z

}