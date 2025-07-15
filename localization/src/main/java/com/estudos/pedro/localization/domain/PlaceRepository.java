package com.estudos.pedro.localization.domain;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends R2dbcRepository<Place, Long> {
}
