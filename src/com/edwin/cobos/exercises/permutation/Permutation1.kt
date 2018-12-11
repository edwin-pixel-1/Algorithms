import kotlin.system.measureNanoTime

fun permutation1(str1: String, str2: String): Boolean {
    println("test permutation 1")

    if (str1.length < str2.length)
        return false

    val map1: MutableMap<Char, Int> = mutableMapOf()
    str2.forEach {
        if (!map1.containsKey(it)) {
            map1[it] = 1
        } else {
            map1[it] = map1[it]!!.plus(1)
        }
    }

    val map2: MutableMap<Char, Int> = mutableMapOf()
    var count = 0
    str1.forEach {
        if (!map2.containsKey(it)) {
            if (map1.containsKey(it)) {
                map2[it] = map1[it]!!.minus(1)
                count++
            } else {
                map2.clear()
                count = 0
            }
        } else {
            if (map2[it]!! > 0) {
                map2[it]!!.minus(1)
                count++
            } else {
                map2.clear()
                count = 0
            }
        }
        if (count == str2.length)
            return true
    }
    return false
}

fun permutation2(str1: String, str2: String): Boolean {
    println("test permutation 2")

    if (str1.length < str2.length)
        return false

    val map1: MutableMap<Char, Int> = mutableMapOf()
    var count1 = 1
    str2.forEachIndexed { i, it ->
        val index = i + 1
        if (!map1.containsKey(it)) {
            map1[it] = index
        }
        count1 *= map1[it]!!
    }

    for (i in 0 until str1.length - str2.length) {
        var count = 1
        for (j in i until i + str2.length) {
            val value: Int? = map1[str1[j]]
            if (value == null) {
                count = 1
                break
            } else {
                count *= value
            }
        }
        if (count == count1)
            return true
    }
    return false
}

fun main(args: Array<String>) {

    val timeElapsed1 = measureNanoTime {
        val result1 = permutation1("abcdalomlecefg", "camello")
        println("Result: $result1")
    }
    println("Time1: $timeElapsed1")


    val timeElapsed2 = measureNanoTime {
        val result2 = permutation2("abcdalomlecefg", "camello")
        println("Result: $result2")
    }
    println("Time2: $timeElapsed2")
}