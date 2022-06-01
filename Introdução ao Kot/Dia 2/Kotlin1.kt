const val MIN_AGE = 18
const val MAX_AGE = 60

fun main() {
    
var age:Int = (0..100).random()
if (age in MIN_AGE..MAX_AGE){

    println("${age} years is available to work!")

}else{
    
    println("${age} years isn't available to work ")
    
}
}
//Treino para memorizar as aulas assistidas