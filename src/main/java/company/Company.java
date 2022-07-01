package company;

import java.io.Serializable;
import java.util.Objects;

public class Company implements Serializable {
    private String companyName;
    private String contactName;
    private String phone;
    private String email;
    private String caseNo;
    private double debt;
    private double rate;
    private double time;

    public Company(String companyName, String contactName, String phone, String email, String caseNo, double debt, double rate) {
        this.companyName = companyName;
        this.contactName = contactName;
        this.phone = phone;
        this.email = email;
        this.caseNo = caseNo;
        this.debt = debt;
        this.rate = rate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Company setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getContactName() {
        return contactName;
    }

    public Company setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Company setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Company setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public Company setCaseNo(String caseNo) {
        this.caseNo = caseNo;
        return this;
    }

    public double getDebt() {
        return debt;
    }

    public Company setDebt(double debt) {
        this.debt = debt;
        return this;
    }

    public double getRate() {
        return rate;
    }

    public Company setRate(double rate) {
        this.rate = rate;
        return this;
    }

    public double getTime() {
        return time;
    }

    public Company setTime(double time) {
        this.time = time;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Double.compare(company.debt, debt) == 0 && Double.compare(company.rate, rate) == 0 && Double.compare(company.time, time) == 0 && Objects.equals(companyName, company.companyName) && Objects.equals(contactName, company.contactName) && Objects.equals(phone, company.phone) && Objects.equals(email, company.email) && Objects.equals(caseNo, company.caseNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, contactName, phone, email, caseNo, debt, rate, time);
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", caseNo='" + caseNo + '\'' +
                ", debt=" + debt +
                ", rate=" + rate +
                ", time=" + time +
                '}';
    }
}
