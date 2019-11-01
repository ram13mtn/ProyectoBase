package sv.mh.fe.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import sv.mh.fe.models.Pets;

public interface PetsRepository extends MongoRepository<Pets, String> {
	  Pets findBy_id(ObjectId _id);
	}