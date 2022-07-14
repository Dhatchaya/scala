object Q5{
    def main(args:Array[String])={
        println(runningTime(2,3,2))
    }
    def easyPace(x:Int):Int=x*8
    def tempo(y:Int):Int=y*7
    def runningTime(x:Int,y:Int,z:Int):Int=easyPace(x)+tempo(y)+easyPace(z)
}