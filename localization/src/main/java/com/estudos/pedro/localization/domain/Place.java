package com.estudos.pedro.localization.domain;

import jakarta.persistence.Table;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Table(schema = "place")
public record Place(
        Long id, String name, String slug, String state,
        @CreatedDate LocalDateTime createdAt, @LastModifiedDate LocalDateTime updatedAt) {

}
