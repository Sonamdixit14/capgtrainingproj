package com.cg.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.patient.model.Patient;

@Component
public class PatientService {
    Patient patient;
    public Patient getPatient() {
    	return patient;
    }
    @Autowired
    public void setPatient(Patient patient) {
    	this.patient=patient;
    }
    public void getPatientDetails() {
    	String result="Patient Id :"+patient.getPid()+
    			"\n patient name:"+patient.getPname()+
    			"\n disease:"+patient.getDisease()+
    			"\n gender:"+patient.getGender()+
    			"\n admit status:"+patient.getAdmit_status()+
    			"\n age:"+patient.getAge();
    	System.out.println(result);
    }
}
