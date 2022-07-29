object Q1{
    def main(args: Array[String])={
         println{deposit_Interest(15000)}
    }
    def deposit_Interest(amount:Int):Double=amount match{
        case amount if amount>=2000000 => amount*0.065
        case amount if amount>=200000=> amount*0.035
        case amount if amount>=20000=> amount*0.04
        case amount if amount< 20000=> amount*0.02
    }
    
    

}