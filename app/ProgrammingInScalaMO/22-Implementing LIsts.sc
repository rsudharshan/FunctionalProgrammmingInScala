/**
 * Created with IntelliJ IDEA.
 * User: Sudharshan
 * Date: 19/7/13
 * Time: 3:05 AM
 */

val xs = List(1, 2, 3)

xs match
{
  case Nil => println("None")
  case x :: xs => println(x)
}

//All list operations can be defined in terms of three basic methods:
/*
def isEmpty: Boolean = true
def head: T

def tail: List[T]

*/

/* These three methods are all abstract in class List. They are defined in the
 subobject Nil and the subclass :: */



case object Nil extends List[Nothing] {
  override def isEmpty = true
  def head: Nothing =
    throw new NoSuchElementException("head of empty list")
  def tail: List[Nothing] =
    throw new NoSuchElementException("tail of empty list")
}








// The definition of the Nil singleton object.


