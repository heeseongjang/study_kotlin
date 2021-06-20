// 10진수 숫자를 입력받아서 2진수 문자열로 변환하는 함수를 작성하라.
fun main(args: Array<String>) {
    println(toBinary(15))
}

fun toBinary(n: Int): String = when {
    n < 2 -> n.toString()
    else -> toBinary(n / 2) + n % 2;
}