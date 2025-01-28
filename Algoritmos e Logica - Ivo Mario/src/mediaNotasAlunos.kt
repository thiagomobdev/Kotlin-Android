fun main() {
    var soma = 0.0
    var alunosAP = 0
    var alunosRP = 0
    var alunos = 3

    println("--> Curso Licenciatura em Computação - UEPG/EAD <<--")
    println("--> Algoritmos e Programação 1 - Ivo Mario <<--")
    println("--> MEDIA NOTA ALUNOS <<--")

    for (i in 1..alunos) {
        print("Digite a 1ª NOTA: ")
        val nota1 = readlnOrNull()?.toDouble() ?: 0.0
        print("Digite a 2ª NOTA: ")
        val nota2 = readlnOrNull()?.toDouble() ?: 0.0
        print("Digite a 3ª NOTA: ")
        val nota3 = readlnOrNull()?.toDouble() ?: 0.0
        print("Digite a 4ª NOTA: ")
        val nota4 = readlnOrNull()?.toDouble() ?: 0.0

        val media = (nota1 + nota2 + nota3 + nota4) / 4
        soma += media

        if (media >= 7) {
            println("Aprovado - Media: $media")
            alunosAP++
        } else {
            println("Reprovado - Media: $media")
            alunosRP++
        }
    }

    val mediaTotal = soma / 3
    println("-->> Media total: $mediaTotal")
    println("Total de alunos: 3")
    println("Alunos aprovados: $alunosAP")
    println("Alunos reprovados: $alunosRP")
}

//ESTE CÓDIGO ABAIXO EU QUE FIZ, O DE CIMA FOI GERADO POR UMA I.A

//fun main(){
//    var nota1: Double
//    var nota2: Double
//    var nota3: Double
//    var nota4: Double
//    var soma = 0.0
//    var alunos = 3
//    var alunosAP = 0
//    var alunosRP = 0
//
//    println("--> Curso Licenciatura em Computação - UEPG/EAD <<--")
//    println("--> Algoritmos e Programação 1 - Ivo Mario <<--")
//    println("--> MEDIA NOTA ALUNOS <<--")
//
//    print("Digite a 1ª NOTA: ")
//    nota1 = (readlnOrNull()?.toDouble() ?: 0) as Double
//    print("Digite a 2ª NOTA: ")
//    nota2 = (readlnOrNull()?.toDouble() ?: 0) as Double
//    print("Digite a 3ª NOTA: ")
//    nota3 = (readlnOrNull()?.toDouble() ?: 0) as Double
//    print("Digite a 4ª NOTA: ")
//    nota4 = (readlnOrNull()?.toDouble() ?: 0) as Double
//
//    var media = (nota1 + nota2 + nota3 + nota4) / 4
//    soma = soma + media
//    alunos++
//
//    if(media >= 7 ){
//        println("Aprovado - Media: $media")
//        alunosAP++
//
//    }else{
//        println("Reprovado - Media: $media")
//        alunosRP++
//    }
//    var media_total = soma / alunos
//    println("-->> Media total: $media_total")
//    println("Total de alunos: $alunos")
//    println("Alunos aprovados: $alunosAP")
//    println("Alunos reprovados: $alunosRP")
//}