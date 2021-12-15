fun main(args: Array<String>) {
    //19
    val intArray= intArrayOf(1,2,4,5,7,100)
    val booleanArray= booleanArrayOf(true, false, true, false)

    println(intArray[0])
    println(booleanArray[2])

    val doubleArray=DoubleArray(4){50.0}
    print("{")
    for(i in 0..doubleArray.size-1) {
        var a=doubleArray[i]
        if(i==doubleArray.size-1){
            print("$a")
        } else{
            print("$a, ")
        }
    }
    print("}")

    //20
    println()
    val playlist= arrayOf("Toy Story","Ironman","I'm legend","Back to the future")

    for(movie in playlist){
        println(movie)
    }
    println()
    val intsArray= intArrayOf(1,2,3,4,5);
    var sum=0
    for(a in intsArray){
        sum+=a
    }
    println(sum)
    var suma=intsArray.sum()
    println(suma)

    println()
    var prod=1
    for(a in intsArray){
        prod*=a
    }
    println(prod)

}