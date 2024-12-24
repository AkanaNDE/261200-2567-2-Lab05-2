import java.time.LocalDate;

public class User {
    protected String name ;
    protected LocalDate dob;

    public User(String name, int year , int month , int day ) {
        this.name = name;
        this.dob = LocalDate.of(year,month,day);
    }

    public User(){
        this.name = null;
        this.dob = LocalDate.now() ;// current date
    }

    public Boolean isBirthday(){
        return this.dob.getMonth() == LocalDate.now().getMonth() && this.dob.getDayOfMonth() == LocalDate.now().getDayOfMonth();

    }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(dob);
    }

}