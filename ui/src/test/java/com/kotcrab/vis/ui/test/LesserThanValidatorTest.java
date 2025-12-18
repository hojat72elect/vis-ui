
package com.kotcrab.vis.ui.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.kotcrab.vis.ui.util.Validators.LesserThanValidator;

import org.junit.Test;

public class LesserThanValidatorTest {
    @Test
    public void testValidateInput() throws Exception {
        LesserThanValidator validator = new LesserThanValidator(5);
        LesserThanValidator validatorEquals = new LesserThanValidator(5, true);

        assertFalse(validator.validateInput("A"));
        assertFalse(validator.validateInput(""));
        assertFalse(validatorEquals.validateInput("A"));
        assertFalse(validatorEquals.validateInput(""));

        assertFalse(validator.validateInput("5"));
        assertTrue(validator.validateInput("4"));
        assertTrue(validatorEquals.validateInput("5"));
        assertTrue(validatorEquals.validateInput("4"));

        assertFalse(validator.validateInput(String.valueOf(Float.MAX_VALUE)));
        assertFalse(validatorEquals.validateInput(String.valueOf(Float.MAX_VALUE)));

        assertTrue(validator.validateInput(String.valueOf(Float.MIN_VALUE)));
        assertTrue(validatorEquals.validateInput(String.valueOf(Float.MIN_VALUE)));
    }
}
