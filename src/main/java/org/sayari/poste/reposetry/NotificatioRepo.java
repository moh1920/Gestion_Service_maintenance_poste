package org.sayari.poste.reposetry;

import org.apache.catalina.util.Introspection;
import org.sayari.poste.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificatioRepo extends JpaRepository<Notification, Integer> {
}
