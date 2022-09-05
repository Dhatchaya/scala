object caeser extends App{
    def encryption(words : String, shift:Int):String = {
        val encrp = words.map(x=>(if((x.toUpper+shift)>90) x-26+shift else x+shift).toChar);
        return encrp;
    }
    def decryption(words : String, shift:Int):String = {
        val decrp = words.map(x=>(if((x.toUpper-shift) <65) x+26-shift else x-shift).toChar);
        return decrp;
    }

    def cipher (func:(String,Int)=>String,text: String,shift:Int):String={
        val cip = func(text,shift);
        return cip;
    }
    println(cipher(encryption,"ABZ",1))
    println(cipher(decryption,"BCA",1))
   
    

}