package org.saltations.mre.places;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import org.saltations.mre.domain.PlaceEntity;
import org.saltations.mre.common.application.CrudEntityRepo;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface PlaceRepo extends CrudEntityRepo<Long, PlaceEntity>
{
}
