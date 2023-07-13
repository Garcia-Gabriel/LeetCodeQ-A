class Solution {
    fun isHappy(n: Int): Boolean {
        var booleano = false
        var m = n.toDouble()
        var sum: Double = 0.toDouble()
        while(m > 0){
          var e = m % 10
          m = Math.floor(m/10)
          sum += e*e
        }
        
        if(sum == 1.0) {
          return true
        } else if (sum > 1.0 && sum <= 4.0){
          return false
        }
      
      return isHappy(sum.toInt())
    }
}