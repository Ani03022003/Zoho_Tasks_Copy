class SumOfOddSubarrays {}

fun main(){
    val arr= listOf(1,4,2,5,3)

    val prefixSum= mutableListOf<Int>()
    val sumArray= mutableListOf<Int>()
    for(i in arr){
        if(prefixSum.isEmpty()){
            prefixSum.add(i)
        }else{
            prefixSum.add(prefixSum.last()+i)
        }
    }
    for(i in 0 until prefixSum.size step 2){
        println(i)
        for(j in i until prefixSum.size){
            if(i>2 && i!=prefixSum.size-1){
                sumArray.add(prefixSum[j]-prefixSum[j-i-1])
            }
            else{
                sumArray.add(arr[j])
            }
        }
    }
    println(prefixSum)
    println(sumArray)
    println(sumArray.sum())
}