package com.example.demoshop.repository;

import com.example.demoshop.domain.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity , Long> {
    @Query(value = "SELECT e from CategoryEntity e WHERE e.categoryName = :categoryName")
    CategoryEntity findByCategoryName(@Param("categoryName" ) String categoryName);

    @Query(value = "SELECT e from CategoryEntity e WHERE e.id = :id")
    CategoryEntity findByIdCategory(@Param("id") long id);

}
