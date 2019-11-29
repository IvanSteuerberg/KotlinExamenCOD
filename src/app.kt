fun main(args: Array<String>) {
    var miComputadora = Ordenador(Cpu(), Raton(), Pantalla())
    println(miComputadora.toString())
    println(
        "Mi computadora tiene ${miComputadora.cpu.memoria} TB de memoria SSD y " +
                "${miComputadora.cpu.velocidad} Mhz de velocidad"
    )
    var ratonSorpresa = Raton("Ay")
    println(ratonSorpresa.tipo)
    var miComp = Ordenador(Cpu(), Raton(), Pantalla())
    println(miComp.toString())
    miComp.memoriaRam = 16
    println("${miComp.memoriaRam} GB de RAM")
    println("Fin de la cita")
//Fin del programa
}