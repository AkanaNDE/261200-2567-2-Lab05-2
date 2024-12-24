import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
        User John = new User ("John",1954, 12, 24 ) ;
        John.displayInfo();
        John.isBirthday();
        John.displayHappyBirthday();
        User Banana = new User();
        Banana.displayInfo();
        Banana.isBirthday();
        John.displayHappyBirthday();
        Admin nicolas = new Admin("nicolas",1964,12,24);
        nicolas.displayInfo();
        nicolas.isBirthday();
        nicolas.displayHappyBirthday();
        nicolas.displayInfo(true) ;
        nicolas.displayInfo(false);

        System.out.print("Name: ");
        String Namee = sin.readLine();
        System.out.print("Year of birth: ");
        int Yearr = Integer.parseInt(sin.readLine());
        System.out.print("Month of birth: ");
        int month = Integer.parseInt(sin.readLine());
        System.out.print("Day of birth: ");
        int dayy = Integer.parseInt(sin.readLine());
        User inputt = new User(Namee, Yearr,month, dayy);
        inputt.displayInfo();
        inputt.isBirthday();
        inputt.displayHappyBirthday();
    }
}