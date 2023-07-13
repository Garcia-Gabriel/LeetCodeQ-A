class MyHashSet() {
    
    private var hashSet = HashSet<Int>()
    
    fun add(key: Int) {
        hashSet.add(key)
    }

    fun remove(key: Int) {
        hashSet.remove(key)
    }

    fun contains(key: Int): Boolean {
        return if(hashSet.contains(key)) true else false    
    }

}
