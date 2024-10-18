package org.sayari.poste.service.impl;

import org.sayari.poste.entity.Notification;
import org.sayari.poste.reposetry.NotificatioRepo;
import org.sayari.poste.service.inter.INotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService implements INotification {
    @Autowired
    private NotificatioRepo notificationRepository;
    @Override
    public Notification createNotificationt(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public Notification updateNotification(Notification notification) {
        return  notificationRepository.save(notification);
    }

    @Override
    public void deleteNotification(Integer id) {
        notificationRepository.deleteById(id);
        System.out.println("notification deleted");
    }

    @Override
    public List<Notification> getNotifications() {
        return notificationRepository.findAll();
    }
}
