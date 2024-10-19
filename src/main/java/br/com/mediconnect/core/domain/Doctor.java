package br.com.mediconnect.core.domain;

import java.util.Date;
import java.util.Objects;

public class Doctor {

    private String id;

    private String name;

    private String CPF;

    private Date birthday;

    private String CRM;

    private String mobileNumber;

    private String mail;

    public Doctor() {
    }

    public Doctor(String id, String name, String CPF, Date birthday, String CRM, String mobileNumber, String mail) {
        this.id = id;
        this.name = name;
        this.CPF = CPF;
        this.birthday = birthday;
        this.CRM = CRM;
        this.mobileNumber = mobileNumber;
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(id, doctor.id) && Objects.equals(name, doctor.name) && Objects.equals(CPF, doctor.CPF) && Objects.equals(birthday, doctor.birthday) && Objects.equals(CRM, doctor.CRM) && Objects.equals(mobileNumber, doctor.mobileNumber) && Objects.equals(mail, doctor.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, CPF, birthday, CRM, mobileNumber, mail);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", CPF='" + CPF + '\'' +
                ", birthday=" + birthday +
                ", CRM='" + CRM + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
