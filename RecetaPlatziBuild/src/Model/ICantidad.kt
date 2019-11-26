package Model

interface ICantidad {

    fun gramosKilos (gramo: Int, kilo: Int): String{
        val gramo = 1000

       return "$gramo"
    }

    fun mililitorsLitros(mili: Int, litro: Int): String{
        val mili = 1000
        return "$mili"
    }

    fun kilosGramos(gramo: Int, kilo: Int): String{
        val kilo = 1
        return "$kilo"
    }

    fun litrosMililitros(mili: Int, litro: Int): String{
        val litro = 1
        return "$litro"
    }
}