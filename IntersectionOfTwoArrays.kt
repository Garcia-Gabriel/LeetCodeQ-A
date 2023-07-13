class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
      var intersections = hashSetOf<Int>()
      for(num in nums1){
        for (comparativo in nums2){
          if(num == comparativo){
            if(!intersections.contains(num)) { 
              intersections.add(num)                     
            }           
          }
        }
      }    
      var result = intArrayOf()
      for (intersection in intersections){
        result += intersection
      }
      return result
  }
}