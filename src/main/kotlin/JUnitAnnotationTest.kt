package Testing_With_JUnit4

import org.junit.*
import org.junit.Assert.*

class JUnitAnnotationTest{
    companion object {
        //exécuter avant la classe
        @BeforeClass
        @JvmStatic
        fun beforeClass() {
            println("before class")
        }
        //exécuter après la classe
        @AfterClass
        @JvmStatic
        fun afterClass() {
            println("after class")
        }
    }
    //exécuter avant le test
    @Before
    fun before() {
        println("before")
    }
    //exécuter après le test
    @After
    fun after() {
        println("after")
    }
    //cas de test
    @Test
      fun test() {
          println("test")
        }
    @Ignore
    fun ignoreTest() {
        println("ignore test");
    }

}