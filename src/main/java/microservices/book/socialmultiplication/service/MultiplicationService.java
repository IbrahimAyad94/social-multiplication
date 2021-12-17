package microservices.book.socialmultiplication.service;

import java.util.List;

import microservices.book.socialmultiplication.domain.Multiplication;
import microservices.book.socialmultiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationService {

	/**
	 * Creates a Multiplication object with two randomlygenerated factors between 11
	 * and 99.
	 *
	 * @return a Multiplication object with random factors
	 */
	Multiplication createRandomMultiplication();

	/**
	 * @return true if the attempt matches the result of the multiplication, false
	 *         otherwise.
	 */
	boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
	
	
	public List<MultiplicationResultAttempt> getStatsForUser(String userAlias);
}
