/*
 Problem: Demonstrate Encapsulation in java.
 Day: 13
 Phase: Encapsulation
 Concepts:
    - Encapsulation
    - Private variables
    - Constructor
    - Getter methods
    - Setter methods
    - Object creation
*/
class BankDetails {
    private String name;
    private String branchname;
    private int accNo;

    BankDetails(String name, String branchname, int accNo) {
        this.name = name;
        this.branchname = branchname;
        this.accNo = accNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBranchName() {
        return branchname;
    }
    public void setBranchName(String branchname) {
        this.branchname = branchname;
    }
    public int accNo() {
        return accNo;
    }
    public void setId(int accNo) {
        this.accNo = accNo;
    }


}
public class BankAccount {
    public static void main(String[] args) {
        BankDetails b1 = new BankDetails("vishal", "mariyamman indian bank", 123456789);
        b1.setName("Raja");
        System.out.println(b1.getName());
    }
}
