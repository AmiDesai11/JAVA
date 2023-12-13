object MergeSets {
  def main(args: Array[String]): Unit = {
    val set1 = Set(1, 2, 3)
    val set2 = Set(3, 4, 5)

    val mergedSet = set1 ++ set2

    println(s"Merged Set: $mergedSet")
  }
}
