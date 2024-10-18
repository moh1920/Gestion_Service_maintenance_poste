package org.sayari.poste.service.inter;

import org.sayari.poste.entity.Region;

import java.util.List;

public interface IRegion {
    Region createRegion(Region region);

    void deleteRegion(Integer idRegion);

    Region getRegionById(Integer idRegion);

    List<Region> getAllRegions();
}
