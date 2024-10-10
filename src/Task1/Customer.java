package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter = 1;

    Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = counter++;
    }

    //Getters and setters

    public String getFirstName()  {
        String gfn = this.firstName;
        return gfn;
    }

    public String getLastName()  {
        String gln = this.lastName;
        return gln;
    }

    public String getUserName()  {
        String gun = this.userName;
        return gun;
    }

    public int getId()  {
        int gid = this.id;
        return gid;
    }

    public void setFirstName(String firstName)  {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)  {
        this.lastName = lastName;
    }
    public void setUserName(String userName)  {
        this.userName = userName;
    }
    public void setFirstName(int id)  {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + "\n" + "Username: " + this.userName + " ID: " + this.id;

    }
}
