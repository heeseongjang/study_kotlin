// 연습문제 3-11에서 작성한 factorial 함수가 꼬리 재귀인지 확인해 보자. 만약 꼬리 재귀가 아니라면 최적화되도록 수정하자.
fun main(args: Array<String>) {
    println(factorial4(3))
}

fun factorial4(n: Int): Int = factorial4(n, 1)

tailrec fun factorial4(n: Int, acc: Int): Int = when {
    n == 1 -> acc
    else -> factorial4(n - 1, n * acc)
}