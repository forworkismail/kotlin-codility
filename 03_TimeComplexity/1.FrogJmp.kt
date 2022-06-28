fun solution(X: Int, Y: Int, D: Int): Int {
  // write your code in Kotlin 1.3.11 (Linux)
  return (Math.ceil((Y - X).toDouble() / D)).toInt()
}