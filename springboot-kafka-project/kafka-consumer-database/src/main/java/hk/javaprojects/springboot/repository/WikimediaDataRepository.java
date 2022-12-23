package hk.javaprojects.springboot.repository;

import hk.javaprojects.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository <WikimediaData,Long> {
}
