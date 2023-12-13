object MergeLists {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6)

    val mergedList = list1 ::: list2

    println(s"Merged List: $mergedList")
  }
}
