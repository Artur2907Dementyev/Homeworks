package lesson34.classwork0406.WebadressFilter;

public class Person {
    private String name;
    private UserType userType;
    private int id;

    public Person(String name, UserType userType, int id) {
        this.name = name;
        this.userType = userType;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
