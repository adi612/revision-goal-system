package com.ai.revisiongoal.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ai.revisiongoal.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
