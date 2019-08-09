package com.uworks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BaseRepository extends JpaRepository, JpaSpecificationExecutor {
}
