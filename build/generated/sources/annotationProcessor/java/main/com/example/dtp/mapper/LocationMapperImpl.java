package com.example.dtp.mapper;

import com.example.dtp.dto.LocationDto;
import com.example.dtp.dto.LocationDto.LocationDtoBuilder;
import com.example.dtp.entity.LocationEntity;
import com.example.dtp.entity.LocationEntity.LocationEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-03T13:56:18+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class LocationMapperImpl implements LocationMapper {

    @Override
    public LocationDto toLocationDto(LocationEntity locationEntity) {
        if ( locationEntity == null ) {
            return null;
        }

        LocationDtoBuilder locationDto = LocationDto.builder();

        locationDto.region( locationEntity.getRegion() );
        locationDto.town( locationEntity.getTown() );
        locationDto.district( locationEntity.getDistrict() );
        locationDto.street( locationEntity.getStreet() );

        return locationDto.build();
    }

    @Override
    public List<LocationDto> toLocationDtoList(List<LocationEntity> locationEntities) {
        if ( locationEntities == null ) {
            return null;
        }

        List<LocationDto> list = new ArrayList<LocationDto>( locationEntities.size() );
        for ( LocationEntity locationEntity : locationEntities ) {
            list.add( toLocationDto( locationEntity ) );
        }

        return list;
    }

    @Override
    public LocationEntity toLocationEntity(LocationDto locationDto) {
        if ( locationDto == null ) {
            return null;
        }

        LocationEntityBuilder locationEntity = LocationEntity.builder();

        locationEntity.region( locationDto.getRegion() );
        locationEntity.town( locationDto.getTown() );
        locationEntity.district( locationDto.getDistrict() );
        locationEntity.street( locationDto.getStreet() );

        return locationEntity.build();
    }

    @Override
    public LocationEntity updateFromDto(LocationDto source, LocationEntity target) {
        if ( source == null ) {
            return null;
        }

        if ( source.getRegion() != null ) {
            target.setRegion( source.getRegion() );
        }
        if ( source.getTown() != null ) {
            target.setTown( source.getTown() );
        }
        if ( source.getDistrict() != null ) {
            target.setDistrict( source.getDistrict() );
        }
        if ( source.getStreet() != null ) {
            target.setStreet( source.getStreet() );
        }

        return target;
    }
}
