package sample.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler(Exception ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(NoSuchCustomerException.class)
	public ResponseEntity<ErrorMessage> exceptionHandler2(NoSuchCustomerException ex){
		
		ErrorMessage err = new ErrorMessage();
		err.setErrorMessage(ex.getMessage());
		err.setErrorCode(HttpStatus.BAD_GATEWAY.value());
		
		System.out.println("Error is " + err.toString());
		
		return new ResponseEntity<>(err, HttpStatus.OK);
	}
}
