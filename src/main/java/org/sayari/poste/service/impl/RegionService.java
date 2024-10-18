package org.sayari.poste.service.impl;

import org.sayari.poste.entity.Region;
import org.sayari.poste.reposetry.RegionRepo;
import org.sayari.poste.service.inter.IRegion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService implements IRegion {
    @Autowired
    private RegionRepo regionRepo ;
    @Override
    public Region createRegion(Region region) {
        return regionRepo.save(region);
    }

    @Override
    public void deleteRegion(Integer idRegion) {
        regionRepo.deleteById(idRegion);
        System.out.println("Region deleted");
    }

    @Override
    public Region getRegionById(Integer idRegion) {
        return regionRepo.findById(idRegion).orElse(null);
    }

    @Override
    public List<Region> getAllRegions() {
        return regionRepo.findAll();
    }
}
