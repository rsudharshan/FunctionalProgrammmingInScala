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


  def reverse(arr: List[Int]): List[Int] = {
    arr match {

      case e :: Nil => e :: Nil
      case t :: tail => {
        reverse(tail) :+ t
      }

    }

  }


  def main(args: Array[String]): Unit = {

    val n = readInt()
    var array: Array[Int] = new Array[Int](n);


     val line=readLine().trim.split(" ")
    for(i <- 0 until n)
    {
      array(i)=line(i).toInt
    }
    array=array.sortWith(_ < _)


    //average
    println(array.sum.toDouble / n )

    //Median ---  the number of integers is odd, the middle element; else, the average of the middle two elements
    n match
    {
      case n if n % 2 == 0 => {
            println((array(n/2 -1)+array(n/2)).toDouble/2)
      }
      case n if n % 2 == 1 => {
        println(array(n/2))
      }
    }

    //Mode

    val fMap=array.groupBy(identity).mapValues(_.size)

    println(fMap.get(fMap.values.max))

    println(fMap)

   }
}
