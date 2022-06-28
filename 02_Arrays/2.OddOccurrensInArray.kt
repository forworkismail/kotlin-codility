fun solution(A: IntArray): Int {
  // write your code in Kotlin 1.3.11 (Linux)
  var result: Int = 0
  for (i in 0..A.size - 1) {
      result = result xor A[i]
  }

  return result
}