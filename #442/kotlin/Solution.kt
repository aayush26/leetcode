class Solution {
    fun findDuplicates(nums: IntArray): List<Int> {
        val result: MutableList<Int> = ArrayList<Int>()
        val temp: MutableList<Int> = ArrayList<Int>()
        for (i in nums) {
            if (temp.contains(i)) {
                result.add(i)
            } else {
                temp.add(i)
            }
        }
        return result
    }
}
