package ru.alina_corp.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.alina_corp.model.Chat;
import ru.alina_corp.repository.ChatRepository;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class ChatService {
    private final ChatRepository chatRepository;

    public Chat getById(Long id) {
        return chatRepository.getById(id);
    }

    public Chat create(String chatName) {
        Chat chat = new Chat();
        chat.setChatName(chatName);
        return chatRepository.save(chat);
    }

    @Transactional
    public Chat update(Chat chat) {
        Chat chatFromDb = chatRepository.getById(chat.getId());
        chatFromDb.setChatName(chat.getChatName());
        return chatRepository.save(chatFromDb);
    }

    public void delete(Chat chat) {
        chatRepository.delete(chat);
    }
}
