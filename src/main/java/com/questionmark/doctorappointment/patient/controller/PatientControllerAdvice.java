package com.questionmark.doctorappointment.patient.controller;

import com.questionmark.doctorappointment.patient.entity.Patient;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.questionmark.doctorappointment.patient.exceptions.PatientExceptions;

@RestControllerAdvice
public class PatientControllerAdvice {

    @ExceptionHandler(value = {PatientExceptions.class })
    public ResponseEntity<String> handleAccountException(PatientExceptions e) {
        return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}