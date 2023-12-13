object MatrixAddition {
  def main(args: Array[String]): Unit = {
    def addMatrices(matrix1: Array[Array[Int]], matrix2: Array[Array[Int]]): Array[Array[Int]] = {
      val rows = matrix1.length
      val cols = matrix1(0).length

      val result = Array.ofDim[Int](rows, cols)

      for (i <- 0 until rows; j <- 0 until cols) {
        result(i)(j) = matrix1(i)(j) + matrix2(i)(j)
      }

      result
    }

    val matrix1 = Array(Array(1, 2), Array(3, 4))
    val matrix2 = Array(Array(5, 6), Array(7, 8))

    val sumMatrix = addMatrices(matrix1, matrix2)

    println("Matrix 1:")
    matrix1.foreach(row => println(row.mkString(" ")))

    println("\nMatrix 2:")
    matrix2.foreach(row => println(row.mkString(" ")))

    println("\nSum of Matrices:")
    sumMatrix.foreach(row => println(row.mkString(" ")))
  }
}
