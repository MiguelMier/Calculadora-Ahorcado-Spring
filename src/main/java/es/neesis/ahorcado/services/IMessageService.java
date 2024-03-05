package es.neesis.ahorcado.services;

public interface IMessageService {

    void sendMail(String to, String subject, String body);

}
