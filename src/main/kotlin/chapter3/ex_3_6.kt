// 입력값 n이 리스트에 존재하는지 확인하는 함수를 재귀로 작성해 보자.
fun main(args: Array<String>) {
    println(elem(5, listOf(1, 3, 2, 8, 4)))
}

fun elem(num: Int, items: List<Int>): Boolean = when {
    items.isEmpty() -> false
    num == items.first() -> true
    else -> elem(num, items.drop(1))
}