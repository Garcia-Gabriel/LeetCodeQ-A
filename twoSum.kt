class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
       val numMap = HashMap<Int, Int>()
       
       for (i in nums.indices) {
         val complement = target - nums[i]
         if (numMap.containsKey(complement)) {
           return intArrayOf(numMap[complement]!!, i)
         }
         numMap[nums[i]] = i
       }
       
       return intArrayOf()
    }
}