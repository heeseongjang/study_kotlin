// 연습문제 3-6에서 작성한 elem 함수가 꼬리 재귀인지 확인해 보자. 만약 꼬리 재귀가 아니라면 개선해 보자.
fun main(args: Array<String>) {
    println(elem2(5, listOf(1, 3, 2, 8, 4)))
}

tailrec fun elem2(num: Int, items: List<Int>): Boolean = when {
    items.isEmpty() -> false
    num == items.first() -> true
    else -> elem2(num, items.drop(1))
}