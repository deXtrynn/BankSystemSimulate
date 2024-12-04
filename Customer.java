package Comp1112.SecondComp1112Project;

public abstract class Customer {

    protected String name;
    protected String address;
    protected String accessableNum;

    public Customer(String name, String address, String accessableNum) {
        this.name = name;
        this.address = address;
        this.accessableNum = accessableNum;
    }

    public String getname() {
        return name;
    }

    public String getaddress() {
        return address;
    }

    public String getcontractdetails() {
        return accessableNum;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public void setcontractdetails(String accessableNum) {
        this.accessableNum = accessableNum;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nAccessable Number: " + accessableNum;
    }

}
