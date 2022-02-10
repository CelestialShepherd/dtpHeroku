package com.example.dtp.mapper;

import com.example.dtp.dto.DtpDto;
import com.example.dtp.dto.DtpDto.DtpDtoBuilder;
import com.example.dtp.entity.DtpEntity;
import com.example.dtp.entity.DtpEntity.DtpEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-03T13:56:19+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class DtpMapperImpl implements DtpMapper {

    @Override
    public List<DtpDto> toDtpDtoList(List<DtpEntity> dtpEntities) {
        if ( dtpEntities == null ) {
            return null;
        }

        List<DtpDto> list = new ArrayList<DtpDto>( dtpEntities.size() );
        for ( DtpEntity dtpEntity : dtpEntities ) {
            list.add( toDtpDto( dtpEntity ) );
        }

        return list;
    }

    @Override
    public DtpEntity toDtpEntity(DtpDto dtpDto) {
        if ( dtpDto == null ) {
            return null;
        }

        DtpEntityBuilder dtpEntity = DtpEntity.builder();

        dtpEntity.driverLicense( dtpDto.getDriverLicense() );
        dtpEntity.timeOfDtp( dtpDto.getTimeOfDtp() );
        dtpEntity.active( dtpDto.getActive() );
        dtpEntity.punishment( dtpDto.getPunishment() );
        dtpEntity.penalty( dtpDto.getPenalty() );

        return dtpEntity.build();
    }

    @Override
    public DtpDto toDtpDto(DtpEntity dtpEntity) {
        if ( dtpEntity == null ) {
            return null;
        }

        DtpDtoBuilder dtpDto = DtpDto.builder();

        dtpDto.driverLicense( dtpEntity.getDriverLicense() );
        dtpDto.timeOfDtp( dtpEntity.getTimeOfDtp() );
        dtpDto.active( dtpEntity.getActive() );
        dtpDto.punishment( dtpEntity.getPunishment() );
        dtpDto.penalty( dtpEntity.getPenalty() );

        return dtpDto.build();
    }

    @Override
    public DtpEntity updateFromDto(DtpDto source, DtpEntity target) {
        if ( source == null ) {
            return null;
        }

        if ( source.getDriverLicense() != null ) {
            target.setDriverLicense( source.getDriverLicense() );
        }
        if ( source.getTimeOfDtp() != null ) {
            target.setTimeOfDtp( source.getTimeOfDtp() );
        }
        if ( source.getActive() != null ) {
            target.setActive( source.getActive() );
        }
        if ( source.getPunishment() != null ) {
            target.setPunishment( source.getPunishment() );
        }
        if ( source.getPenalty() != null ) {
            target.setPenalty( source.getPenalty() );
        }

        return target;
    }
}
