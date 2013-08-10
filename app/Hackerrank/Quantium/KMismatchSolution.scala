package Hackerrank.Quantium

/**
 * Created with IntelliJ IDEA.
 * User: Sudharshan
 * Date: 10/8/13
 * Time: 11:08 AM
 * To change this template use File | Settings | File Templates.
 */
object KMismatchSolution {



  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val K = readInt()
    val S = readLine()

    def mismatch(x: String, y: String): Int = {
      var mCount = 0
      val n = x.length

      (0 until n).foreach(g => {
        if (x(g) != y(g))
          mCount += 1
      })

      if (mCount <= K)
        1
      else
        0
    }

    val pairs = (0 until S.length).map(i => {
      (i + 1 to S.length).map({
        j => {
          S.substring(i, j)
        }
      })
    }).flatten

    val groupedPairs = pairs.groupBy(_.length)
    val paircounts = groupedPairs.mapValues(_.size)
    var mismatchCount = 0

    paircounts.filter(k => k._2 > 1).foreach(k => {
      val vect = groupedPairs(k._1)
      (0 until vect.length - 1).foreach(index => {
        //for each vector
        (index + 1 until vect.length).foreach(elem => {
          mismatchCount += mismatch(vect(index), vect(elem))
        })

      })
    })

    println(mismatchCount)


  }


}
