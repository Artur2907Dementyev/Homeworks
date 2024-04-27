package consultation_10.enums;

public class User {

    private String email;
    private String password;

    private Role role;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.role = Role.USER;
    }

    public String info() {
        return "User{" +
                "role=" + role +
                ", email='" + email + '\'' +
                '}';
    }



}
