package com.whitecape.services;


import com.whitecape.entities.Region;

public interface RegionService {
        Region addRegion(Region region);
        Region updateRegion (Region region,long regionId);
        void deleteRegion (long regionId);
    }

