package com.accolite.bookstore.mysql.dao;
import org.springframework.data.repository.CrudRepository;

import com.accolite.bookstore.model.Opportunity;
public interface OpportunityDao extends CrudRepository<Opportunity,Integer> {

}
