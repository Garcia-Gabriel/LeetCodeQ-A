class Solution {
  fun firstUniqChar(s: String): Int {
    val charCount = IntArray(26) 
    val map = LinkedHashMap<Char, Int>() 
    
    for (index in s.indices) {
        val char = s[index]
        charCount[char - 'a']++
        
        if (charCount[char - 'a'] == 1) {
            map[char] = index
        } else {
            map.remove(char)
        }
    }

    return map.values.firstOrNull() ?: -1 
}

}