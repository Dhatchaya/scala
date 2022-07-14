object Q4{
    def main(args:Array[String])={
        println(finalCost(60))
    }
    def coverPrice(p:Int):Double= p*24.95
    def discount(d:Int):Double=coverPrice(d)*0.4
    def shipping(s:Int):Double= if(s>50) 3*50+0.75*(s-50) else 3*s 
    def finalCost(x:Int):Double= coverPrice(x)-discount(x)+shipping(x)
    }