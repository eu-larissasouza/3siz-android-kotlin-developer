package com.fiap.lotteryapp.ui.navigation

// Classe selada = Possui um funcionamento similar a uma enumeração
// Todos os subtipos diretos são conhecidos e definidos
sealed class Routes(val route: String) {

    // Object em Kotlin é similar ao static do Java e não precisa ser instanciado
    object Input : Routes("input")

    object Result : Routes("result/{${Args.AMOUNT}}") {

        object Args {
            const val AMOUNT = "amount"
        }

        // Toda vez que chamar esse metodo, ele constrói a rota.
        fun createRoute(amount: Int) = "result/${amount}"
    }
}