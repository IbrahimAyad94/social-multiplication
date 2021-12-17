package microservices.book.socialmultiplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import microservices.book.socialmultiplication.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByAlias(final String alias);
}
