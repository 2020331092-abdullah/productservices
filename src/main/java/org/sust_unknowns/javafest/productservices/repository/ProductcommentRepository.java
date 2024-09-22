package org.sust_unknowns.javafest.productservices.repository;

import org.sust_unknowns.javafest.productservices.model.Productcomment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductcommentRepository extends MongoRepository<Productcomment, String> {
}
