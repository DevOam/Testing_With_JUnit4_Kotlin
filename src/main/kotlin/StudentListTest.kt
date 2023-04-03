import org.junit.*
import org.junit.Assert.*

class StudentListTest {
    private var list: StudentList? = null
    @Before
    fun setUp() {
        list = StudentList()
    }

    @After
    fun tearDown() {
        println("After")
    }

    @Test
    fun testAdd() {
        list?.add("Ali")
        list?.add("Amal")
        list?.add("Kamal")
        list?.add("Amine")
        assertEquals("Ajout de 4 étudiants à la liste", 4, list?.sizeOfStudent())
    }

    @Test
    fun testRemove() {
        list?.add("Fatima")
        list?.add("Amine")
        list?.remove("Amine")
        assertEquals("Suppression d'un étudiant de la liste", 1, list?.sizeOfStudent())
    }

    @Test
    fun removeAll() {
        list?.removeAll()
    }
}