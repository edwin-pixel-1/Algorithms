package com.edwin.cobos.exercises.KokoEatingBananas

/**
 * 875. Koko Eating Bananas
 * https://leetcode.com/problems/koko-eating-bananas/
 */
class KokoEatingBananas {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        if (piles.isEmpty()) return 0
        piles.sort()
        var index1 = 1
        var index2 = piles[piles.size - 1]
        while (index1 < index2) {
            val middleIndex: Int = (index2 + index1) / 2
            if (checkPile(piles, middleIndex, h)) {
                index2 = middleIndex
            } else {
                index1 = middleIndex + 1
            }
        }
        return index1
    }

    private fun checkPile(piles: IntArray, divider: Int, limitHours: Int): Boolean {
        var totalHours = 0
        piles.forEach {
            totalHours += if (it % divider == 0) (it / divider) else (it / divider + 1)
            //totalHours += (it - 1) / divider + 1
        }
        return totalHours <= limitHours
    }

}

fun main(args: Array<String>) {

    val kokoEatingBananas = KokoEatingBananas()

    val array = arrayOf(30, 11, 23, 4, 20).toIntArray()
    val h = 5
//    val array = arrayOf(312884470).toIntArray()
//    val h = 312884469
    println("Array: ${array.contentToString()}")
    val result = kokoEatingBananas.minEatingSpeed(array, h)
    println("Result: $result")
}