// 코드 3-9의 take 함수를 참고하여 repeat함수를 테스트 하기 위해서 사용한 takeSequence 함수를 작성해보자.
// 그리고 repeat 함수가 잘 동작하는지 테스트 해보자.
fun main(args: Array<String>) {
//    println(takeSequence(5, repeat(3)));
}

//fun repeat(n: Int): Sequence<Int> = sequenceOf(n) + {repeat(n)}
fun takeSequence(n: Int, sequence: Sequence<Int>): List<Int> = when {
    sequence.none() -> listOf()
    n <= 0 -> listOf()
    else -> sequence.take(1).toList() + takeSequence(n - 1, sequence)
}