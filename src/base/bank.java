package base;

public class bank {
    private String name;
    private String email;
    public bank() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void successfully(){
        System.out.println("\nAccount created.");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
    public void display(){
        System.out.println("\nAccount Details.");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
