package JavaProject2;
//Create Registration Class in which you would have variables as
//email, userName and password that have an access scope only
//within its own class. After creating an object of the class user should
//be able to call methods and in each method separately pass values
//to set users email, username and password.
//Requirements:
//A. Valid email consider to be only yahoo
//B. Valid userName and password cannot be empty and should be of
//length larger than 6 characters. Also valid password cannot contain
//userName.

public class Registration {
    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
       this.email = email;
       this.userName = userName;
       this.password = password;
    }
    public void setEmail(String email) {
        if(email.contains("@yahoo")) {
           this.email = email;
        }else{
            System.out.println("you dont have a valid email address");
        }
    }
    public void setPassword(String password ){
        if(!password.isEmpty()&&password.length()>6&&password!=userName){
            this.password=password;
        }else{
            System.out.println("password does not meet requirements");
        }

    }
    public void setUserName(String userName) {

        if(!userName.isEmpty()&& userName.length()>6){
            this.userName = userName;
        }else{
            System.out.println("Username does not meet requirements.");
        }
    }
    public String getUserName(){
        return userName;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    public static void main(String[] args) {
        Registration r=new Registration("Hind@yahoo.com","Hind88","Apple123");
        System.out.println("email "+r.getEmail());
        System.out.println("user name "+r.getUserName());
        System.out.println("password "+r.getPassword());

    }
}
