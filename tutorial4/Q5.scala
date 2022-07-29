
object Q5 extends App{
    def toUpper(text:String):String={
        return text.map(ch=>ch.toUpper)
    }
    def toLower(text:String):String={
        return text.map(c=>c.toLower)
    }
    def formatNames(text:String,function:String=>String):String={
        function(text)

    }
    println(formatNames("Benny",toUpper))
    print(formatNames("Niroshan".slice(0,2),toUpper))
    println(formatNames("Niroshan".slice(2,8),toLower))
    println(formatNames("Saman",toLower))
    print(formatNames("K",toUpper))
    print(formatNames("umar",toLower))
    println(formatNames("a",toUpper))


}
