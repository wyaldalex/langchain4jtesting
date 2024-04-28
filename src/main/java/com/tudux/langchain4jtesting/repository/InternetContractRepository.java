package com.tudux.langchain4jtesting.repository;

import com.tudux.langchain4jtesting.entity.InternetContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternetContractRepository extends JpaRepository<InternetContract,Long> {
}
