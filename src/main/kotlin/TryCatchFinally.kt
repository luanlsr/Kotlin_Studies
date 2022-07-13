fun main() {
    try {
        val s: String? = null
        val a = 10/0
        println(s!!.length)
    }
    catch (e: NullPointerException){
        println("Variável nula")
    }
    catch (e: ArithmeticException)
    {
        println("Impossível dividir por ZERO!")
    }
    finally {
        println("fim!")
    }
}