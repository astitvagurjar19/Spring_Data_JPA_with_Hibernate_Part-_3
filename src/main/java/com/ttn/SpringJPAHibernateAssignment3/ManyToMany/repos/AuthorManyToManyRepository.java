package com.ttn.SpringJPAHibernateAssignment3.ManyToMany.repos;

import com.ttn.SpringJPAHibernateAssignment3.ManyToMany.entities.AuthorManyToMany;
import org.springframework.data.repository.CrudRepository;

public interface AuthorManyToManyRepository extends CrudRepository<AuthorManyToMany,Integer> {

}
