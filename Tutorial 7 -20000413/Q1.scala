object Q1 extends App{

    class Rational(x:Int,y:Int){
        val numer = x
        val denom = y
        require (y >0,"denominator must be positive")
        def neg = new Rational(-this.numer,this.denom)
        def this(n:Int)= this(n,1)
        
        override def toString = numer+"/"+denom

    }
    val n=1
    val d=2
    val result = new Rational(n,d)

    println(result.neg);
    
}