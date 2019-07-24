package com.lg.dao;

import com.lg.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {

    @Query(value = "select * from user where id = :id", nativeQuery = true)
    User findById(@Param("id") Integer id);
}
