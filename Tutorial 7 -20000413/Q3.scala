object Q3 extends App{
var bank : List[Account]= List()
class Account(a:Int,b:Double,id:Int){
    val nic = id
    var balance=b
    val acc = a

    //transfer amount from one account to another
    def transfer(user:Account,amount:Int)={
        this.balance=this.balance-amount
        user.balance = user.balance+amount
      
    } 
    override def toString = "nic: "+nic + " account number: "+acc+" balance: "+balance


}
val x= new Account(123,5000,2000059300)
val y= new Account(954,8000,2000148936)
x.transfer(y,2000)
println(x)
println(y)
}