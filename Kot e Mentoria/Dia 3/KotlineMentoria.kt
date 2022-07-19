fun main (){
    
    val x:Float? = 5.toFloat()
    val y:Float? = 2.toFloat()
    val op = listOf(::sum, ::sub, ::mult, ::porcentagem, ::division)
    val opChoosed = 4//U can change the operation here
    val result:Float
    
    when{
    	x==null -> {println("O primeiro valor é nulo")}
        y==null -> {println("O segundo valor é nulo")}
        else -> {result = calculate(x, y, op[opChoosed])
				println(result)
        }
    }
    
    
}

fun sum(a1:Float, a2:Float) = a1.plus(a2)
fun sub(a1:Float, a2:Float) = a1.minus(a2)
fun mult(a1:Float, a2:Float) = a1.times(a2)
fun porcentagem(a1:Float, a2:Float) = a2.div(a1)*100
fun division(a1:Float, a2:Float) = a1.div(a2)
fun calculate(n1:Float, n2:Float, operation:(Float,Float)->Float):Float{
    
    val result = operation(n1, n2)
    return result
    
}
//Base de uma calculadora, será melhorada de acordo com o avanço dos estudos, preciso aprender ainda métodos de interação com o usuário