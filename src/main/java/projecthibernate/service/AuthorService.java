package projecthibernate.service;

import java.io.Serializable;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import projecthibernate.entity.Author;
import projecthibernate.repository.YourJpaRepository;

@Service
@Configuration
public class AuthorService extends YourJpaRepository<Author> implements Serializable {

	private static final long serialVersionUID = 1L;

}
