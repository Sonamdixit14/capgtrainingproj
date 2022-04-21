package com.cg.patient.Patients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.patient.service.PatientService;

public class main{
	public static void main(String[]args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(com.cg.patient.Patients.appconfig.class);
	     PatientService patientService = context.getBean(PatientService.class);
	     patientService.getPatientDetails();
	}

}
