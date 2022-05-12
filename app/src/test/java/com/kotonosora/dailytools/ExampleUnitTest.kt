package com.kotonosora.dailytools

import com.kotonosora.dailytools.model.Dice
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun generates_number() {
        val dice = Dice(6)
        val rollResult = dice.roll()

        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }
}