fun solution2(A: IntArray): Int {
  var result = (A.size + 1) * (A.size + 2) / 2;
  for (i in 0..A.size - 1) {
        result = result - A[i]
    }

   return result
}