package ru.alina_corp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alina_corp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
