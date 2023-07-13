class Solution {
  fun isIsomorphic(s: String, t: String): Boolean {
    var map = hashMapOf<Char, Char>()
    for (i in 0 until s.length){
      if(!map.containsKey(s[i]) && !map.containsValue(t[i])){
        map.put(s[i], t[i])
      } else {
        var checkValue = map[s[i]]
        if(checkValue != t[i]){
          return false
        }
      }
    }
    return true
  }
} 