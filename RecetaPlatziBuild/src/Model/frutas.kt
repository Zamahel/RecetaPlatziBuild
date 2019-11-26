package Model

abstract class frutas(var fruta1: String, var fruta2: String, var fruta3: String) {
    override fun toString(): String {
        return "\nfruta 1: $fruta1 \n" +
                "fruta 2: $fruta2 \n" +
                "fruta 3: $fruta3"
    }

}