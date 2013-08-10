object SSolution {


  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
    */

    val n = readInt()
    var array: Array[Int] = new Array[Int](n);


    val line = readLine().trim.split(" ")
    for (i <- 0 until n) {
      array(i) = line(i).toInt
    }


    //average
    val mean = array.sum.toDouble / n
    println(f"$mean%.1f")

    //sorting array
    array = array.sortWith(_ < _)

    //Median ---  the number of integers is odd, the middle element; else, the average of the middle two elements
    n match {
      case n if n % 2 == 0 => {
        val median=(array(n / 2 - 1) + array(n / 2)).toDouble / 2
        println(f"$median%.1f")
      }
      case n if n % 2 == 1 => {
        val median=array(n / 2)
        println(f"$median%.1f")
      }
    }

    //Mode

    //get frequency count
    val fMap = array.groupBy(identity).mapValues(_.size)

    //sort by value and then key , to get the desired order
    val modeElem = fMap.toSeq.sortBy(_._2).sortBy(_._1)
    println(modeElem(0)._1)


    // Standard deviation

    val sd = Math.pow(array.map(k => Math.pow((k - mean), 2.0)).sum / n, 0.5)
    println(f"$sd%.1f")


    //Standard Error
    val stdError=sd/Math.pow(mean,0.5)
    val lowerCI=mean - (stdError * 2.262)
    val upperCI=mean + (stdError * 2.262)
    println(lowerCI +" "+upperCI)

  }
}