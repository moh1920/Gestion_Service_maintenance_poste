package org.sayari.poste.reposetry;

import org.sayari.poste.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepo extends JpaRepository<Region,Integer> {
}
