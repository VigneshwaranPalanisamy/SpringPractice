package com.sample.spring.mvc.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PinCodeConstraintValidator implements ConstraintValidator<PinCode, String> {

	//private String prefix;
	private String[] prefixes;
	
	@Override
	public void initialize(PinCode constraintAnnotation) {
		prefixes = constraintAnnotation.value();
	}
	
	@Override
	public boolean isValid(String thePinCode, ConstraintValidatorContext context) {
boolean result = false;
        
        if (thePinCode != null) {
            
            //
            // loop thru course prefixes
            //
            // check to see if code matches any of the course prefixes
            //
            for (String tempPrefix : prefixes) {
                result = thePinCode.startsWith(tempPrefix);
                
                // if we found a match then break out of the loop
                if (result) {
                    break;
                }
            }
        }
        else {
            result = true;
        }
        
        return result;
	}

}
