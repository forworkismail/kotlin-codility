fun solution(N: Int): Int {
  // write your code in Kotlin 1.3.11 (Linux)
  var temp = N
  var count = 0
  var foundOne = false
  var maxCount = 0
  while (temp > 0) {
      if(temp % 2 != 0) {
          foundOne = true
          count = 0
      } else {
          if (foundOne) {
              count++
          }
      }
      temp = (temp / 2)
      maxCount = Math.max(maxCount, count)
  }

  return maxCount
}