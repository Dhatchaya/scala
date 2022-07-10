object Q4_A{
  def main(args: Array[String]) = {

    println("Take Home salary is : Rs."+ Net_salary(30,40))

  }
  def OT(x:Int):Int=x*85
  def Normal_rate(y:Int):Int=y*250
  def Gross_salary(x:Int,y:Int):Int=OT(x)+Normal_rate(y)  
  def Net_salary(x:Int,y:Int):Double=Gross_salary(x,y)-Gross_salary(x,y)*0.12

}