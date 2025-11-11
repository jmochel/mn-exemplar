package org.saltations.mre.people;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import org.saltations.mre.domain.PersonEntity;
import io.micronaut.data.repository.CrudRepository;

/**
 * Repository for the Person entity
 */

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface PersonRepo extends CrudRepository<PersonEntity, Long>
{
}
