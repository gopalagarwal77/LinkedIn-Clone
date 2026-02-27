package com.linkedin.users_service.repository.user;

import com.linkedin.users_service.entity.UserFiles;
import com.linkedin.users_service.enums.UserFileType;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserFileRepository extends JpaRepository<UserFiles,Long> {
    Optional<UserFiles> findByUserIdAndType(long userId, UserFileType type);

    List<UserFiles> findByUserId(long userId);
}
