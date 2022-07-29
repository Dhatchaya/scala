object Q2 extends App{
	case class shoppingCart(Name:String,price:Double,quantity:Int)
	val cart1=shoppingCart("vanilla ice cream",3.99,13)
	val cart2=shoppingCart("chocolate biscuits",4,6)
	val cart3=shoppingCart("cupcakes",7.77,7)
	val allCarts =List(cart1,cart2,cart3)
	
	def printItems(cart:List[Main.shoppingCart]):Any={
		cart.foreach{i=>
		println(s"${i.quantity} ${i.Name} at Rs.${i.price} each")
		}
		 
	}
	println("Items in the shopping cart: ")
	printItems{allCarts}
	def checkVanila(carts:List[Main.shoppingCart]):Any= {
	carts.foreach{i=>
		(i.Name).contains("vanilla ice cream") match{
		
		case true =>println(s"Item: ${i.quantity} ${i.Name} at Rs.${i.price} each")
		case _=>println(s"Found another item")
			
		}
	}
    
}
println("Vanilla ice cream products: ")
checkVanila(List(cart1,cart2,cart3))
    
}

