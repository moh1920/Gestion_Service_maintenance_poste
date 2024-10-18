package org.sayari.poste.service.inter;

import org.sayari.poste.entity.Notification;

import java.util.List;

public interface INotification {
    Notification createNotificationt(Notification notification);
    Notification updateNotification(Notification notification);
    void deleteNotification(Integer id);
    List<Notification> getNotifications();
}
