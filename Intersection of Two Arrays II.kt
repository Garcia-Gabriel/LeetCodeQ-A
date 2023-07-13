class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val map = hashMapOf<Int, Int>()
        var result = intArrayOf()

        for (index in 0 until nums1.size) {
            val key = nums1[index]
            map[key] = map.getOrDefault(key, 0) + 1
        }

        for (index in 0 until nums2.size) {
            val key = nums2[index]
            if (map.containsKey(key) && map[key] != 0) {
                map[key] = map[key]!! - 1
                result += key
            }
        }

        return result
    }
}
