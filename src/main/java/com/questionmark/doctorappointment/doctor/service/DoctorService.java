package com.questionmark.doctorappointment.doctor.service;

import com.questionmark.doctorappointment.appointment.exceptions.AppointmentExceptions;
import com.questionmark.doctorappointment.doctor.entity.Doctor;
import com.questionmark.doctorappointment.appointment.entity.Appointment;
import com.questionmark.doctorappointment.doctor.exceptions.DoctorExceptions;
import com.questionmark.doctorappointment.doctor.dto.LoginDTo;

import java.util.List;

public interface DoctorService {
    //Doctor DoctorLogin(String userName,String userPassword);

    public Appointment cancelAppointment(Integer appointmentId) throws DoctorExceptions;
    public Appointment confirmAppointment (Integer appointmentId, Double amount) throws DoctorExceptions;

    List<Appointment> getAllAppointmentOfDoctor(Integer doctorId) throws DoctorExceptions;

    Doctor login(LoginDTo loginDTo) throws DoctorExceptions;
}
