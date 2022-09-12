object Q2 extends App{
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  class Rational(x:Int,y:Int){
    val numer = x/gcd(x,y)
    val denom = y/gcd(x,y)
    def neg(): Rational = {
       val z = new Rational(-x, y)
        return z
    }

    def -(r:Rational)=new Rational(numer*r.denom-r.numer*denom,denom*r.denom)
    override def toString :String = x.toString+"/"+y.toString

  }
   
  val x=new Rational(3,4)
  val y=new Rational(5,8)
  val z=new Rational(2,7)

  println( x - y- z);
    
}