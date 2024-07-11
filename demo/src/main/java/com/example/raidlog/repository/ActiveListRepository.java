package com.example.raidlog.repository;

import com.example.raidlog.entity.ActiveList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiveListRepository extends JpaRepository<ActiveList, Long> {
}
