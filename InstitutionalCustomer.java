package Comp1112.SecondComp1112Project;

public class InstitutionalCustomer extends Customer {

    private String typeOfInstitution;
    private String IndustrySector;
    private double annualRevenue;

    public InstitutionalCustomer(String typeOfInstitution, String IndustrySector, double annualRevenue, String name, String address, String accessableNum) {
        super(name, address, accessableNum);
        this.typeOfInstitution = typeOfInstitution;
        this.annualRevenue = annualRevenue;
        this.IndustrySector = IndustrySector;
    }

    public String gettypeOfInstitution() {
        return typeOfInstitution;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAccessableNum() {
        return accessableNum;
    }

    public String getIndustrySector() {
        return IndustrySector;
    }

    public double getannuelRevenue() {
        return annualRevenue;
    }

    public void setannualRevenue(double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public void settypeOfInstitution(String typeOfInstitution) {
        this.typeOfInstitution = typeOfInstitution;
    }

    public void setIndustrySector(String IndustrySector) {
        this.IndustrySector = IndustrySector;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType Of Institution: \n" + typeOfInstitution + "Industry Sector: \n" + IndustrySector + "Annual Revenue: " + annualRevenue + "TL";
    }

}
