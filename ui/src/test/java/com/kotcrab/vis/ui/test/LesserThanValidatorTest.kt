package com.kotcrab.vis.ui.test

import com.kotcrab.vis.ui.util.Validators.LesserThanValidator
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class LesserThanValidatorTest {

    @Test
    fun testValidateInput() {
        val validator = LesserThanValidator(5F)
        val validatorEquals = LesserThanValidator(5F, true)

        assertFalse(validator.validateInput("A"))
        assertFalse(validator.validateInput(""))
        assertFalse(validator.validateInput("5"))
        assertTrue(validator.validateInput("4"))
        assertFalse(validator.validateInput(Float.MAX_VALUE.toString()))
        assertTrue(validator.validateInput(Float.MIN_VALUE.toString()))


        assertFalse(validatorEquals.validateInput("A"))
        assertFalse(validatorEquals.validateInput(""))
        assertTrue(validatorEquals.validateInput("5"))
        assertTrue(validatorEquals.validateInput("4"))
        assertFalse(validatorEquals.validateInput(Float.MAX_VALUE.toString()))
        assertTrue(validatorEquals.validateInput(Float.MIN_VALUE.toString()))
    }
}
