package com.herb;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herb.entity.Permit;

public interface PermitRepository extends JpaRepository<Permit, Long> {

}
