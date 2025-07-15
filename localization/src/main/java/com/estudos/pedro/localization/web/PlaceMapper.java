package com.estudos.pedro.localization.web;

import com.estudos.pedro.localization.api.PlaceResponse;
import com.estudos.pedro.localization.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse( Place place) {
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updatedAt());
    }
}
