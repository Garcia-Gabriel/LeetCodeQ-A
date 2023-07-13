class Solution {
  fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
    var minimumValue = Int.MAX_VALUE
    var stringArray = listOf<String>()
    var map = mutableMapOf<String, Int>()
    for (i in 0 until list1.size){
      for (j in 0 until list2.size){
        if(list1[i] == list2[j]){
          map.put(list1[i], i+j)
          if(i+j < minimumValue){
            minimumValue = i+j
          }
        }
      }
    }
    val minimumKeys = map.filterValues { it == minimumValue }.keys
    for(key in minimumKeys) stringArray += key.toString()
    return stringArray.toTypedArray()
  }
}