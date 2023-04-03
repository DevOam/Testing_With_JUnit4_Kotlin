import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class PrimeNumberCheckerTest(private val numeroEntree: Int, private val resultatAttendu: Boolean) {
    private var primeNumberChecker: PrimeNumberChecker? = null


    @Before
    fun initialize() {
        primeNumberChecker = PrimeNumberChecker()
    }

    // Chaque paramètre doit être placé comme un argument ici.
// Chaque fois que le runner se déclenche, il passe les arguments
// à partir des paramètres définis dans la méthode primeNumbers().
    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun primeNumbers(): Collection<Array<Any>> {
            return listOf(
                arrayOf(2, true),
                arrayOf(6, false),
                arrayOf(19, true),
                arrayOf(22, false),
                arrayOf(23, true),
                arrayOf(73, true),
                arrayOf(121, false)
            )
        }
    }

    // Ce test sera exécuté 7 fois puisque nous avons 7 paramètres définis.
    @Test
    fun testPrimeNumberChecker() {
        println("Nombre paramétré est : $numeroEntree")
        assertEquals(resultatAttendu, primeNumberChecker!!.validate(numeroEntree))
    }
}