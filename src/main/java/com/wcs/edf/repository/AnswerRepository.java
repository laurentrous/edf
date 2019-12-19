package com.wcs.edf.repository;

import com.wcs.edf.entity.Answer;
import com.wcs.edf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
