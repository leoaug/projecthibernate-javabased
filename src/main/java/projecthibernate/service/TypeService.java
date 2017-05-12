package projecthibernate.service;

import java.io.Serializable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import projecthibernate.entity.Type;
import projecthibernate.repository.YourJpaRepository;

@Service
@Configuration
public class TypeService extends YourJpaRepository <Type> implements Serializable{
	private static final long serialVersionUID = 1L;
}
