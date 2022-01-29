package com.edwin.cobos.exercises.binarySearch

class BinarySearch {

    fun find(array: Array<Int>, value: Int): Int {
        return find1(array, value, 0)
    }

    private fun find2(array: Array<Int>, value: Int): Int {
        if (array.isEmpty()) return 0
        var arraySize = array.size - 1
        var indexOffset = 0
        while (indexOffset <= arraySize) {
            val middleIndex: Int = indexOffset + ((arraySize - indexOffset) / 2)
            println("middleIndex: $middleIndex")
            if (array[middleIndex] == value) {
                return middleIndex
            }

            if (value > array[middleIndex]) {
                indexOffset = middleIndex + 1
            } else {
                arraySize = middleIndex - 1
            }
        }
        return -1
    }

    private fun find1(array: Array<Int>, value: Int, index: Int): Int {
        if (array.isEmpty()) return -1
        val middleIndex = (array.size - 1) / 2
        if (value == array[middleIndex]) {
            return index + middleIndex
        }
        println("middleIndex: $middleIndex")
        var newIndex = index
        val subArray: Array<Int> = if (value > array[middleIndex]) {
            newIndex = middleIndex + 1
            array.copyOfRange(middleIndex + 1, array.size)
        } else {
            array.copyOfRange(0, middleIndex)
        }

        return find1(subArray, value, newIndex)
    }

}

fun main(args: Array<String>) {
    val search = BinarySearch()
    val array = arrayOf(5, 3, 7, 1, 8, 4)
    array.sort()

    println(array.contentToString())
    val result = search.find(array, 5)
    println("Result: $result")

    /*array.forEach {
        val result1 = search.find(array, it)
        println("==== Result $it: $result1")
    }*/
}