fun solution(A: IntArray, K: Int): IntArray {
  // write your code in Kotlin 1.3.11 (Linux)
  val i: Int = A.size - (K % (if (A.size != 0) A.size else 1))
  return intArrayOf(*A.slice(i..A.size - 1).toIntArray(), *A.slice(0..i - 1).toIntArray())
}