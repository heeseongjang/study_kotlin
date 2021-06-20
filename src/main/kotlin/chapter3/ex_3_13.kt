// 연습문제 3-2에서 작성한 power 함수가 꼬리 재귀인지 확인해 보자. 만약 꼬리 재귀가 아니라면 개선해 보자.
fun main(args: Array<String>) {
    println(power2(3.0, 2))
}

tailrec fun power2(x: Double, acc: Int): Double {
    return when (acc) {
        1 -> x
        else -> power2(x * x, acc - 1)
    }
}
