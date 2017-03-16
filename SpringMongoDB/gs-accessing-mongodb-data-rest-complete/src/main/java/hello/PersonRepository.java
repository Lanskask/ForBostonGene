
package hello;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends MongoRepository<Person, String> {

	List<Person> findByLastName(@Param("name") String name);

	List<Person> findByEmail(@Param("email") String name);

/*	void setBirthday(@Param("birthday") Date birthday);

	void setEmail(@Param("email") String email);

	void setPw_hash(@Param("password") String password);*/

}
