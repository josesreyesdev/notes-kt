package unitTest

import codelabsGoogle.unit1KotlinBasics.luckyDiceRoll.Dice
import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(5, 2+3)
    }

    @Test
    fun generates_number() {
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("The value of rollResult = $rollResult, was not between 1 and 6", rollResult in 1..6)
    }
}