package it.uniroma3.siw.spring.controller.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import it.uniroma3.siw.spring.model.Trofeo;

@Component
public class TrofeoValidator implements Validator {
	
	private static final Logger logger = LoggerFactory.getLogger(TrofeoValidator.class); 

	@Override
	public void validate(Object o, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nome", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "numeroVittorie", "required");

		if(!errors.hasErrors()) {
			logger.debug("Non ci sono errori"); 
		}
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Trofeo.class.equals(clazz);
	}
}
