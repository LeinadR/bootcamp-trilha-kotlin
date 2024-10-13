fun main() {
    var cargo:String = "gerente"
        when(cargo){
            "Presidente" -> println(9000f)
            "Gerente" -> println(8000f)
            "Coordenador" -> println(7000f)
            "Analista" -> println(6000f)
            "Estagiario" -> println(2000f)
            else -> println("Cargo não identificado")
        }
}