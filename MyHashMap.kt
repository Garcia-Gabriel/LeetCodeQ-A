class MyHashMap() {
    
    private var hashMap = HashMap<Int, Int>()

    fun put(key: Int, value: Int) {
        hashMap.set(key, value)
    }

    fun get(key: Int): Int {
        return if(hashMap.containsKey(key)) hashMap.get(key).toString().toInt() else -1
    }

    fun remove(key: Int) {
        hashMap.remove(key)
    }

}
