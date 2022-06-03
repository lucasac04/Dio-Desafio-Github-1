fun main (){
    
    val x:Int = 5
    val y:Int = 2
    val op = listOf(::sum, ::sub, ::mult, ::division)
    val opChoosed = 3 //U can change the operation here
    val result:Int
    
    result = calculate(x, y, op[opChoosed])
	println(result)
    
    
}

fun sum(a1:Int, a2:Int) = a1.plus(a2)
fun sub(a1:Int, a2:Int) = a1.minus(a2)
fun mult(a1:Int, a2:Int) = a1.times(a2)
fun division(a1:Int, a2:Int) = a1.div(a2)
fun calculate(n1:Int, n2:Int, operation:(Int,Int)->Int):Int{
    
    val result = operation(n1, n2)
    return result
    
}

//Base de uma calculadora, será melhorada de acordo com o avanço dos estudos, preciso aprender ainda métodos de interação com o usuário