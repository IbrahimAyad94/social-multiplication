package microservices.book.socialmultiplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import microservices.book.socialmultiplication.domain.Multiplication;

public interface MultiplicationRepository extends JpaRepository<Multiplication, Long> {

}
