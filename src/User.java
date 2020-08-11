public class User {
    private String name;
    private String secName;
    private  String email;
    private  String password;
    private String mNumber;
    private  String wNumber;
    public User(String name, String secName, String email, String password, String mNumber, String  wNumber ){
        this.name = name;
        this.secName = secName;
        this.email = email;
        this.password = password;
        this.mNumber = mNumber;
        this.wNumber = wNumber;

    }
    public User(String email, String password ) {
        this.email = email;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public String getSecName() {
        return secName;
    }
    public String getEmail() {
        return email;
    }
    public String getPass() {
        return password;
    }
    public String getMPhone() {
        return mNumber;
    }
    public String getWPhone() {
        return wNumber;
    }
}
