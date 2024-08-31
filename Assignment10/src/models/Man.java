
package models;

public class Man {
    protected String name, address, email, phoneNumber;
    protected int id;
    public Man(String name, String address, String email, String phoneNumber, int id)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }
}
