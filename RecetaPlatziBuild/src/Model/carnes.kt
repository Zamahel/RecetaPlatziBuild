package Model

abstract class carnes(var carne1: String, var carne2: String, var carne3: String) {
    override fun toString(): String {
        return "\ncarne 1: $carne1 \n" +
                "carne 2: $carne2 \n" +
                "carne 3: $carne3"
    }

}