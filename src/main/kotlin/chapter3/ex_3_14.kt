// 연습문제 3-4에서 작성한 toBinary 함수가 꼬리 재귀인지 확인해 보자. 만약 꼬리 재귀가 아니라면 개선해 보자.
fun main(args: Array<String>) {
    println(toBinary2(15))
}

fun toBinary2(n: Int) = toBinary2(n, "")

tailrec fun toBinary2(n: Int, acc: String): String = when {
    n == 0 -> acc
    else -> toBinary2(n / 2, "${n % 2}$acc")
}