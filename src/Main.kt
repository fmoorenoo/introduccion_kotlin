import kotlin.random.Random

// Introducción a kotlin

fun main() {
    // >>> Declaración de variables <<<
    var nombre = "Fer"
    println("Mi nombre es $nombre.")

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

    // >>> If - Else if - Else <<<
    val edad = 19
    if (edad == 0) {
        println("Acabas de nacer")
    } else if (edad < 18) {
        println("Eres menor de edad")
    } else {
        println("Eres mayor de edad")
    }

    // >>> When (switch en python) <<<
    val dia = 5
    val mensaje = when {
        dia == 1 -> "¡Ánimo, es lunes!"
        dia in 2..4 -> "Semana en curso."
        dia == 5 -> "Por fin viernes."
        dia == 6 || dia == 7 -> "Fin de semana."
        else -> "Día no válido."
    }
    println(mensaje)

    // >>> Declaración de lista mutable <<<
    var miLista = mutableListOf<Int>(1, 2, 3, 4, 5)

    // >>> Declaración de lista inmutable <<<
    var otraLista = listOf(1, 2, 3, 4, 5)

    // >>> Bucles <<<
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

    // >>> Listas <<<
    val listaMutable = mutableListOf(10, 20, 30, 40, 50)
    listaMutable.add(60)
    println("Lista mutable: $listaMutable")

    val listaInmutable = listOf("Manzana", "Plátano", "Cereza")
    println("Lista inmutable: $listaInmutable")

    // Operaciones con listas
    val numeros = listOf(1, 2, 3, 4, 5)
    val numerosPares = numeros.filter { it % 2 == 0 }
    println("Números: $numeros")
    println("Números pares: $numerosPares")

    // >>> Seguridad por posibles valores nulos (Null Safety) <<<
    // El '?' maneja la posibilidad de que un valor sea nulo, sin que se produzca un error a la hora de ejecutarlo
    var nombreNulo: String? = null
    println("Nombre nulo: ${nombreNulo ?: "No hay nombre"}")

    // >>> Clases y Data Class <<<
    // Clase
    class Personita(val nombre: String, var edad: Int) {
        // Un método
        fun informacion() {
            println("Nombre: $nombre, Edad: $edad")
        }
    }

    // Crear objeto de una clase
    val persona = Personita("Fer", 25)
    persona.informacion()
    
    // Dataclass
    data class Persona(val nombre: String, var edad: Int)

    val persona1 = Persona("Fer", 25)
    val persona2 = Persona("Ana", 30)
    println("Persona 1: $persona1")
    println("Persona 2: $persona2")

    // Comparación de datos
    println("¿Son iguales las personas? ${persona1 == persona2}")

    // Copia con modificaciones
    val persona3 = persona1.copy(nombre = "Luis")
    println("Persona 3: $persona3")

    // >>> Funciones <<<
    fun suma(a: Int, b: Int): Int {
        return a + b
    }

    // Función en una linea
    fun resta(a: Int, b: Int) = a - b

    println("Suma de 6 y 5 es: ${suma(6, 5)}")
    println("Resta de 9 y 4 es: ${resta(9, 4)}")

    // Función con valor por defecto
    fun saludar(nombre: String = "Amigo") = println("Hola, $nombre!")
    saludar()
    saludar("Sara")
}
