import kotlin.random.Random

// Introducción a Kotlin



fun main() {
    // >>> Declaración de variables <<<
    // Variables mutables (var)
    var nombre = "Fer"
    println("Mi nombre es $nombre.")


    // Variables inmutables (val)
    val ciudad = "Barcelona"
    println("Vivo en $ciudad.")


    // >>> Tipos de datos <<<
    val numeroEntero: Int = 100
    val numeroDecimal: Double = 6.66
    val numeroLargo: Long = 1234567890123456789L
    val caracter: Char = 'x'
    val cadena: String = "Esto es una cadena"
    val boolean: Boolean = true

    // println imprime en una nueva línea. El $ se usa para introducir las variables.
    println("Entero: $numeroEntero, Decimal: $numeroDecimal, Num largo: $numeroLargo, Carácter: $caracter, Cadena: $cadena, Boolean: $boolean")

    // If - Else if - Else
    val edad = 19
    if (edad == 0) {
        println("Acabas de nacer")
    } else if (edad < 18) {
        println("Eres menor de edad")
    } else {
        println("Eres mayor de edad")
    }

    // When (switch en python)
    val dia = 7
    val nombreDia = when (dia) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Día no válido"
    }
    println("Hoy es $nombreDia")

    // Declaración de lista mutable
    var miLista = mutableListOf<Int>(1, 2, 3, 4, 5)

    // Declaración de lista inmutable
    var otraLista = listOf(1, 2, 3, 4, 5)


    // Bucles
    // For
    // Recorrer un rango
    for (i in 1..5) {
        println("Usuario $i")
    }

    // Recorrer un iterable
    for (i in miLista) {
        println("Usuario $i")
    }

    // While
    var contador = 1
    while (contador <= 3) {
        println("Contador: $contador")
        contador++
    }

    // Funciones
    fun suma(a: Int, b: Int): Int {
        return a + b
    }

    // Función en una linea
    fun resta(a: Int, b: Int) = a - b

    println("Suma de 6 y 5 es: ${suma(6, 5)}")
    println("Resta de 9 y 4 es: ${resta(9, 4)}")
}