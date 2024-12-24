import java.time.LocalDate;

public class Admin extends User {

    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day);
    }
    public  Admin(){
        super();
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("User type: admin.");
    }

    public Boolean isBirthday(){
         return this.dob.getMonth() == LocalDate.now().getMonth() && this.dob.getDayOfMonth() == LocalDate.now().getDayOfMonth();

    }

    public void displayHappyBirthday() {
        int age = LocalDate.now().getYear() - this.dob.getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }

    public void displayInfo(boolean full){
        if (full) {
            super.displayInfo();
            System.out.println("User type: admin.");
            System.out.println(LocalDate.now());
        }else System.out.println(name);
    }
}
