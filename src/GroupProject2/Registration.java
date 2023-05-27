package GroupProject2;

public class Registration {

    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
        } else {
            this.email = "Invalid email";

        }
    }

   void setUserName(String userName) {
        this.userName = userName;
    }

   void setPassword(String password) {
        if(password!=userName && password.length()>6 && password.isEmpty()==false ){
        this.password = password;}
        else{
            this.password = "Invalid Password";
        }
    }
}
class RegistrationTester{
    public static void main(String[] args) {
        Registration user=new Registration();
        user.setEmail("tiadorh.rue@yahoo.com");
        System.out.println(user.getEmail());

        user.setUserName("Tiarue1");
        System.out.println(user.getUserName());

        user.setPassword("Password123");
        System.out.println(user.getPassword());


    }


}
