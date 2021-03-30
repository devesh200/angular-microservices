package com.bookmybus.bustrip.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.bookmybus.bustrip.domain.Bustrip;
import java.util.Optional;

public interface BustripRepository extends MongoRepository<Bustrip, String> {
	
	@Query("{'fromLoc':?0, toLoc:?1, startDateTime : {$gt : ?2}}")
	public Optional<List<Bustrip>> searchBustrip(String fromLoc, String toLoc, Date startDateTime);

}
