object Q5 extends App{

    class Account(a:Int,b:Double,id:Int){
        val nic = id
        var balance=b
        val acc = a

        // //calculate interest
        def interest():Double={
            if (balance>0) balance=balance+balance*0.0005 else balance= balance + balance*0.001
            return balance
        }

        override def toString = "[" +"nic: "+nic + " account number: "+acc+" balance: "+balance+"]"


    }
    //adds all the account balance
    var balance = (b:List[Account])=>b.map(_.balance).reduce((x,y)=>x+y)

    //calls the interest function for every object and finds the total balance
    var interest=(b:List[Account])=>b.map(_.interest()).reduce((x,y)=>x+y)
    
    //gets the negative balance
    var overdraft= (b:List[Account])=>b.filter(x=>x.balance<0)

    //bank accounts
    val acc1= new Account(123,5000,2000059300)
    val acc2= new Account(954,-8000,2000148936)
    val acc3= new Account(697,10000,200279436)
    val acc4= new Account(175,11000,2003484786)
    val acc5= new Account(648,-1000,2000448936)

    //Bank with a list of bank accounts
    var bank : List[Account]= List(acc1,acc2,acc3,acc4,acc5)

    //Print the overdrafted balance
    println(overdraft(bank))

    //print the sum of all the balance
    println(balance(bank))

    //total balance with interest
    println(interest(bank))


}