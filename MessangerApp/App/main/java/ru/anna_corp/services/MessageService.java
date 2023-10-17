package ru.alina_corp.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.alina_corp.model.Message;
import ru.alina_corp.repository.MessageRepository;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository;
    public Message getById(Long id) {
        return messageRepository.getById(id);
    }

    public Message create(String text, Long userId, Long chatId) {
        Message message = new Message();
        message.setText(text);
        message.setUserId(userId);
        message.setChatId(chatId);
        return messageRepository.save(message);
    }

    @Transactional
    public Message update(Message message) {
        Message messageFromDb = messageRepository.getById(message.getId());
        messageFromDb.setText(message.getText());
        messageFromDb.setChatId(message.getChatId());
        messageFromDb.setUserId(message.getUserId());
        return messageRepository.save(messageFromDb);
    }

    public void delete(Message message) {
        messageRepository.delete(message);
    }

}
