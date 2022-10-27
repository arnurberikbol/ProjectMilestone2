package com.seproject.projectmilestone2.converter;

import com.seproject.projectmilestone2.dto.DoctorDto;
import com.seproject.projectmilestone2.entity.Doctor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DoctorConverter {

    public static DoctorDto entityToDto(Doctor doctor) {
        DoctorDto doctorDto = new DoctorDto();

        doctorDto.setId(doctor.getId());
        doctorDto.setIin(doctor.getIin());
        doctorDto.setName(doctor.getName());
        doctorDto.setSurname(doctor.getSurname());
        doctorDto.setMiddlename(doctor.getMiddlename());
        doctorDto.setDate_of_birth(doctor.getDate_of_birth());
        doctorDto.setAddress(doctor.getAddress());
        doctorDto.setCategory(doctor.getCategory());
        doctorDto.setContact_number(doctor.getContact_number());
        doctorDto.setDegree(doctor.getDegree());
        doctorDto.setDepartment_id(doctor.getDepartment_id());
        doctorDto.setExperience(doctor.getExperience());
        doctorDto.setPhoto(doctor.getPhoto());
        doctorDto.setPrice(doctor.getPrice());
        doctorDto.setRating(doctor.getRating());
        doctorDto.setSchedule_details(doctor.getSchedule_details());
        doctorDto.setSpecialization_details_id(doctor.getSpecialization_details_id());

        return doctorDto;
    }

    public static List<DoctorDto> entityToDto(List<Doctor> doctor) {
        return doctor.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
    }

    public static Doctor dtoToEntity(DoctorDto doctorDto) {
        Doctor doctor = new Doctor();

        doctor.setId(doctorDto.getId());
        doctor.setIin(doctorDto.getIin());
        doctor.setName(doctorDto.getName());
        doctor.setSurname(doctorDto.getSurname());
        doctor.setMiddlename(doctorDto.getMiddlename());
        doctor.setDate_of_birth(doctorDto.getDate_of_birth());
        doctor.setAddress(doctorDto.getAddress());
        doctor.setCategory(doctorDto.getCategory());
        doctor.setContact_number(doctorDto.getContact_number());
        doctor.setDegree(doctorDto.getDegree());
        doctor.setDepartment_id(doctorDto.getDepartment_id());
        doctor.setExperience(doctorDto.getExperience());
        doctor.setPhoto(doctorDto.getPhoto());
        doctor.setPrice(doctorDto.getPrice());
        doctor.setRating(doctorDto.getRating());
        doctor.setSchedule_details(doctorDto.getSchedule_details());
        doctor.setSpecialization_details_id(doctorDto.getSpecialization_details_id());

        return doctor;
    }

    public static List<Doctor> dtoToEntity(List<DoctorDto> doctorDto) {
        return doctorDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }

}
