
package com.kotcrab.vis.ui.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.kotcrab.vis.ui.util.Validators.GreaterThanValidator;

import org.junit.Test;

public class GreaterThanValidatorTest {

    @Test
    public void testValidateInput() throws Exception {
        GreaterThanValidator validator = new GreaterThanValidator(5);
        GreaterThanValidator validatorEquals = new GreaterThanValidator(5, true);

        assertFalse(validator.validateInput("A"));
        assertFalse(validator.validateInput(""));
        assertFalse(validatorEquals.validateInput("A"));
        assertFalse(validatorEquals.validateInput(""));

        assertFalse(validator.validateInput("5"));
        assertTrue(validator.validateInput("6"));
        assertTrue(validatorEquals.validateInput("5"));
        assertTrue(validatorEquals.validateInput("6"));

        assertTrue(validator.validateInput(String.valueOf(Float.MAX_VALUE)));
        assertTrue(validatorEquals.validateInput(String.valueOf(Float.MAX_VALUE)));

        assertFalse(validator.validateInput(String.valueOf(Float.MIN_VALUE)));
        assertFalse(validatorEquals.validateInput(String.valueOf(Float.MIN_VALUE)));
    }
}
