package org.saltations.mre.common.application;

import io.micronaut.data.repository.CrudRepository;

import java.util.List;

/**
 * Minimum contract for a repository that provides CRUD operations for entities of type E.
 *
 * @param <ID> Type of the entity identifier.
 * @param <E> Class of the entity.
 */

public interface CrudEntityRepo<ID, E> extends CrudRepository<E, ID> {

    List<E> findAllById(Iterable<ID> ids);

    void deleteAllById(Iterable<ID> ids);
}
