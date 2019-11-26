import Model.carnes
import Model.recetaFrutas
import  Model.recetaCarne

fun main(args: Array<String>) {

      exit@ while (true) {

        val mensajeInicial = """
        :: Bienvenido a Recipe Maker::
        
        Seleccione la opcion deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()

        println(mensajeInicial)


        try {
            val response = readLine()?.toInt()?:0
            if (response==4){
                println("Por favor elija una opcion")
                continue@exit
            }

            if (response==1){
                println("${viewRecipe(titulo0 = "Bienvenido")}")
                val nombre_receta:String?= readLine()?.toString()?:"Mi Receta"
                println("${viewRecipe(titulo1 = "Hola, Estas viendo tus Ingredientes ")}")
                for ((index,ingredient) in "${recetaFrutas("limon", "fresa", "uva")}".withIndex()){
                    println("${index+1}.-${ingredient}")
                }
                println("\n 0.-Guardar receta\n -1.-Salir ")
                var receta_nueva:String = nombre_receta + ": "
                val desarrolloReseta: String = """
                    Aqui escribe el desarrollo de tu receta
                """.trimIndent()
                println(desarrolloReseta.trimIndent())

            }

            if (response==2) {
                println("${viewRecipe(titulo1 = "Hola, Estas viendo tus Ingredientes en Vertical" )}")
                println("Estas son las frutas disponibles:\n ${recetaFrutas("limon", "fresa",
                    "uva\n")} " + "\nEstos son las carnes disponibles:\n${recetaCarne("chuleta", "chorizo",
                    "lomo cerdo")}" )
                continue@exit
            }

            if (response==3){
                break@exit
            }



        } catch (e: NumberFormatException) {
            println("Ingresa un valor del 1 al tres")
        }
    }
    val crearRecetaFrutas = recetaFrutas(fruta1 =  "limon", fruta2 = "fresa",fruta3 = "uva")

    val crearRecetaCarne = recetaCarne(carne1 = "chuleta", carne2 = "chorizo", carne3 = "lomo cerdo")

}



fun viewRecipe(titulo0: String="Bienveidos" , titulo1: String="Hola, Estas viendo tus Ingredientes",
titulo2: String="Ve tu receta", titulo3: String="Salr"): String{
    return "${titulo0} ${titulo1} ${titulo2} ${titulo3} "
}