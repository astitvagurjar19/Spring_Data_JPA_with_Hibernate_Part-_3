package com.ttn.SpringJPAHibernateAssignment3.OneToOne.repos;

import com.ttn.SpringJPAHibernateAssignment3.OneToOne.entities.AuthorOneToOne;
import org.springframework.data.repository.CrudRepository;

public interface AuthorOneToOneRepository extends CrudRepository<AuthorOneToOne,Integer> {

}
