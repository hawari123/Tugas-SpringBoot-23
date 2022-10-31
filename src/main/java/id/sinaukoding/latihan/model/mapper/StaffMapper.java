package id.sinaukoding.latihan.model.mapper;

import id.sinaukoding.latihan.model.Staff;
import id.sinaukoding.latihan.model.dto.StaffDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StaffMapper {
    StaffMapper INSTANCE = Mappers.getMapper(StaffMapper.class);
    Staff dtoToEntity(StaffDTO dto);

    StaffDTO entityToDto(Staff param);

    List<Staff> toEntityList(List<StaffDTO> data);

    List<StaffDTO> toDtoList(List<Staff> data);

    StaffDTO fromStaffToStaffDTODTO(StaffDTO param);

    List<StaffDTO> toStaffDTO(List<StaffDTO> data);

}