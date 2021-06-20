// 연습문제 3-5에서 작성한 replicate 함수가 꼬리 재귀인지 확인해 보자. 만약 꼬래 재귀가 아니라면 개선해 보자.

fun main(args: Array<String>) {
    println(replicate2(3, 5))
}

fun replicate2(n: Int, element: Int): List<Int> = replicate2(n, element, listOf())

tailrec fun replicate2(n: Int, element: Int, acc: List<Int>): List<Int> = when {
    n == 0 -> acc
    else -> replicate2(n - 1, element, acc + listOf(element))
}