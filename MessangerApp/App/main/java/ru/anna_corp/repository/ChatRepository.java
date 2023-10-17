package ru.alina_corp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alina_corp.model.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
}
