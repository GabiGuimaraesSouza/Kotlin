fun main() {
    var cont = 0
    var num = 0
    var media = 0

    do {
        println("Digite qualquer número: ")
        num = readln().toInt()
        if (num %3 == 0) {
            cont += num
        }
    } while (num !== 0)
    println("A média de todos os números digitados, múltiplos de 3 é: ${num/cont}")
}