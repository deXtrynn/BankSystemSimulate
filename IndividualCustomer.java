package Comp1112.SecondComp1112Project;

public class IndividualCustomer extends Customer {

    private String gender;
    private String Identification;
    private String occupation;

    public IndividualCustomer(String name, String address, String accessableNum, String gender, String Identification, String occupation) {
        super(name, address, accessableNum);
        this.gender = gender;
        this.occupation = occupation;
        this.Identification = Identification;
    }

    public String getgender() {
        return gender;
    }

    public String getaccessableNum() {
        return accessableNum;
    }

    public String getIdentification() {
        return Identification;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public void setIdentification(String Identification) {
        this.Identification = Identification;
    }

    public void setoccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccessableNum(String accessableNum) {
        this.accessableNum = accessableNum;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGender: " + gender + "\nIdentification Info: " + Identification + "\nOccupation: " + occupation;
    }
}
