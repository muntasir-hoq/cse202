package offlineProject;

/**
 * Created by Muntasir on 9/15/2015.
 */
public class Customer {
    private String name;
    private String email;
    private char gender;

    public Customer()
    {

    }

    public Customer(String n,String e,char g)
    {
        name=n;
        email=e;
        gender=g;
    }

    public Customer(String name1)
    {
        name=name1;
        email="";
        gender=' ';
    }


    public void setEmail(String email1) {
        email = email1;
    }

    public void setGender(char gender1) {
        gender = gender1;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void  print()
    {
        System.out.println(name + " (" + gender + ") at " + email);
    }
}
