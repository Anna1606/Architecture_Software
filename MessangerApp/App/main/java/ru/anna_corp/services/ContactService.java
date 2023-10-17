package ru.alina_corp.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.alina_corp.model.Contact;
import ru.alina_corp.repository.ContactRepository;

@Service
@AllArgsConstructor
public class ContactService {
    private final ContactRepository contactRepository;

    public Contact getById(Long id) {
        return contactRepository.getById(id);
    }

    public Contact create(Long userOwnerId, Long userId) {
        Contact contact = new Contact();
        contact.setUserOwnerId(userOwnerId);
        contact.setUserId(userId);
        return contactRepository.save(contact);
    }

    public void delete(Contact contact) {
        contactRepository.delete(contact);
    }
}
