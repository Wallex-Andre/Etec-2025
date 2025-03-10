fun main() {
    println("Exercício 1")
    println()
    ex1()
    println()
    println("Exercício 2")
    println()
    ex2()
    println()
    println("Exercício 3")
    println()
    ex3()
    println()
    println("Exercício 4")
    println()
    ex4()
    println()
    println("Exercício 5")
    println()
    ex5()
    println()
    println("Exercício 6")
    println()
    ex6()
    println()
    println("Exercício 7")
    println()
    ex7()
    println()
    println("Exercício 8")
    ex8()
    println()
    println("Exercício 9")
    println()
    ex9()
    println()
    println("Exercício 10")
    println()
    ex10()
}

fun ex1() {
    val name = "Wallex"
    println(name)
}

fun ex2() {
    /*Cria a variavel nome e atribui um valor para ela*/
    val name = "Wallex"
    /*Exibe o valor da variavel nome*/
    println(name)
}

fun ex3() {
    val a = 4
    val b = 2
    val soma = a + b
    val subtração = a - b
    val divisão = a / b
    val multiplicação = a * b
    println("a + b = $soma")
    println("a - b = $subtração")
    println("a ÷ b = $divisão")
    println("a x b = $multiplicação")
}

fun ex4() {
    val base = 2
    val altura = 5
    val area = base * altura
    println("A área do retangulo é base x altura = $area")
}

fun ex5() {
    val nome = "Wallex"
    println("Seu nome é $nome")
}

fun ex6() {
    val arrayInt:Array<Int> = arrayOf(1, 2, 3)

    val array = arrayInt[0]
    println(array)

    val array2 = arrayInt[1]
    println(array2)

    val array3 = arrayInt[2]
    println(array3)
}

fun ex7() {
    val lista = mutableListOf(1, 2, 3, 4)
    println("Lista atual $lista")
    println()
    lista.add(5)
    println("Numero 5 adicionado na lista")
    println()
    println(lista)
}

fun ex8() {
    val listaDeSenhas = listOf("abc", "senha123", "123", "2009")
    val senhaCorreta = "123"

    for (senha in listaDeSenhas) {
        println()
        if (senha == senhaCorreta) {
            println("A senha $senha está correta, acesso concedido")
        } else {
            println("A senha $senha está incorreta, acesso negado")
        }
    }
}

fun ex9() {
    val a = 5
    val b = 1

    if (a > b) {
        println("O número $a é maior que o $b")
    }

    else if(a < b) {
        println("O número $b é maior que o $a")
    }
    else {
        println("Numeros iguais")
    }
}

fun ex10() {
    var a = 1
    var n = 1
    var r = 0

    while(r <= 9){
        r = a * n;
        println("$a x $n = $r")
        n++
    }
}
