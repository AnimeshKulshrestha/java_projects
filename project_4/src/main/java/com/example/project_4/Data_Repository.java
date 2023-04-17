package com.example.project_4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface Data_Repository extends JpaRepository<Data_class,Integer> {

    @Override
    Optional<Data_class> findById(Integer integer);
}
