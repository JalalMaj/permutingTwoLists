import java.util.Collections

/*
 * Complete the 'twoArrays' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY A
 *  3. INTEGER_ARRAY B
 */

fun twoArrays(k: Int, A: List<Int>, B: List<Int>): String {
    // Write your code here
    var permuteA = A.sorted()
    var permuteB= B.sorted().reversed()
    var sum = 0
    var c = 0
    for (i in 0..A.size-1) {
        sum = permuteA[i] + permuteB[i]
        if (sum >= k) c++ else c = 0
    }
    if (c == A.size) return "YES" else return "NO"
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val k = first_multiple_input[1].toInt()

        val A = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toList()

        val B = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toList()

        val result = twoArrays(k, A, B)

        println(result)
    }
}
