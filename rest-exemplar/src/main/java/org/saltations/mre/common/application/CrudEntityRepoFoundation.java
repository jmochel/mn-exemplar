package org.saltations.mre.common.application;

import java.util.List;

import io.micronaut.core.annotation.NonNull;
import org.saltations.mre.common.domain.Entity;

/**
 * Foundation (provides some default functionality) repository for entities of type E.
 *
 * @param <ID> Type of the <em>entity</em> identifier .
 * @param <E> Class of the <em>entity</em>.
 */

public abstract class CrudEntityRepoFoundation<ID,E extends Entity<ID>> implements CrudEntityRepo<ID,E>
{
    // Intentionally empty: rely on CrudRepository default methods like findAllById and deleteAllById
}
