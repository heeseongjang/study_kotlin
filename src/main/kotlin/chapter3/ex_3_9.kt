// 최대 공약수를 구하는 gcd 함수를 작성해 보자.
fun main(args: Array<String>) {
    println(gcd(3, 6));
}

fun gcd(m: Int, n: Int): Int = when {
    n == 0 -> m
    else -> gcd(n, m % n)
}