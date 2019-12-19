package com.wcs.edf.repository;

import com.wcs.edf.entity.Article;
import com.wcs.edf.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
