fun main() {

  print("Digite a idade para saber sua categoria: ")

  val resp = readln() .toInt()

  when(resp) {
    in 10..14 -> println("infantil")
      in 15..17 -> println("juvenil")
    in 18..25 -> println("adulto")
  }

}