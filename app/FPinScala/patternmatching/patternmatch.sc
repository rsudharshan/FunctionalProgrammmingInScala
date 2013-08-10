/**
 * Created with IntelliJ IDEA.
 * User: Sudharshan
 * Date: 10/8/13
 * Time: 2:43 AM
 * To change this template use File | Settings | File Templates.
 */

def readChars(): List[Int] = {


  val ins:Option[Int] =  try {
    println("Read value ")
    val s=new java.util.Scanner(System.in)
    Some(s.nextInt())
  } catch {
    case e: java.io.EOFException => { println("End")
      None}
    case e: NullPointerException => { println("End")
      None}
  }
  val list: List[Int] = ins match {
    case Some(n) => {
      println("Reading next to "+n)
      n :: readChars()
    }
    case None => Nil
  }
  list
}

val l=readChars()
println(l)