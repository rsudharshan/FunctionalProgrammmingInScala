/**
 * Created with IntelliJ IDEA.
 * User: Sudharshan
 * Date: 10/8/13
 * Time: 1:10 AM
 * To change this template use File | Settings | File Templates.
 */
object Solution {
  def readChars(): List[String] = {
    val ins = readLine()
    val list:List[String] = ins match {
      case n if !n.equals("") =>{
        //        readChars().+:(n)
        n :: readChars()
      }
      case n if n.equals("") => Nil
    }
    list
  }

  def read():List[String]  =
  {
    val l=collection.mutable.ListBuffer[String]()
    var n:String=""
  while(n.equals(""))
  {
      val m=readLine()
  if(m.equals(""))
     n=""
  }


l.toList
  }



  def translateToKoane(humans:List[String]):List[String]=
  {
    val koane=humans.map(_.reverse).reverse
    koane
  }

  def main(x: Array[String]) {
    val humans = readChars()
    val koanes= translateToKoane(humans)
    println(koanes.mkString("\n"))

  }
}
