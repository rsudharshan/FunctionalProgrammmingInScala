object Hello {
  //remove odd positions
  //  def f(arr: List[Int]): List[Int] = {
  //    arr match {
  //      case x :: y :: (xs: List[Int]) => {
  //        y :: f(xs)
  //      }
  //      case x :: y :: Nil => {
  //        y :: Nil
  //      }
  //
  //      case x :: Nil => Nil
  //      case Nil => Nil
  //    }
  //
  //  }


  def f(arr: List[Int]): List[Int] = {
    arr match {

      case e :: Nil => e :: Nil
      case t :: tail => {
        f(tail) :+ t
      }

    }

  }


  def main(args: Array[String]): Unit = {
    println("Hello, world!" + f(List(1, 2, 3, 4)))
  }
}
