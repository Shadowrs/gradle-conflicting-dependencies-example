object Action {
    fun doStuff() {
        Shop.buyProduct(Currency.CASH) {
            println("hi $it")
        }
    }
}