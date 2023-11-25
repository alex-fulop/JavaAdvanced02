package org.example.exceptii;

public class UnderageException extends RuntimeException {

	private String responsablePerson;

	public UnderageException(String message) {
		super(message);
	}
}
