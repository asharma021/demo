package com.example.raidlog.repository;

import com.example.raidlog.entity.DoneList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoneListRepository extends JpaRepository<DoneList, Long> {
}
