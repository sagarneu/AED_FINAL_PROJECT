/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.InsuranceCustomer.InsuranceCustomer;

/**
 *
 * @author sagred
 */
public class Patient {

    private String patientId;
    private String patientFirstName;
    private String patientLastName;
    private String ssn;
    private String patientAge;
    private String phone;
    private String address;
    private String gender;
    private boolean isTreatmentdone;
    private String aptDate;
    private String patientMail;
    private String doctorType;

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }

    public String getPatientMail() {
        return patientMail;
    }

    public void setPatientMail(String patientMail) {
        this.patientMail = patientMail;
    }

    private InsuranceCustomer insuranceCustomer;

    public Patient() {

    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public InsuranceCustomer getInsuranceCustomer() {
        return insuranceCustomer;
    }

    public void setInsuranceCustomer(InsuranceCustomer insuranceCustomer) {
        this.insuranceCustomer = insuranceCustomer;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public String toString() {
        return String.valueOf(patientId);
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public boolean isIsTreatmentdone() {
        return isTreatmentdone;
    }

    public void setIsTreatmentdone(boolean isTreatmentdone) {
        this.isTreatmentdone = isTreatmentdone;
    }

    public String getAptDate() {
        return aptDate;
    }

    public void setAptDate(String aptDate) {
        this.aptDate = aptDate;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

}
