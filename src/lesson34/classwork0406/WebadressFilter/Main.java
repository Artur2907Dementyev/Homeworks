package lesson34.classwork0406.WebadressFilter;

public class Main {
    public static void main(String[] args) {
        Person admin = new Person("Admin", UserType.ADMIN, 124423575);
        Person user = new Person("User", UserType.USER, 235654345);


        Filter filter = new WebadressFilter();

        System.out.println("Admin access: " + filter.allowAccess("http://example.com", admin.getUserType()));
        System.out.println("User access: " + filter.allowAccess("http://quick-to-go/hub", user.getUserType()));
        System.out.println("User access: " + filter.allowAccess("http://example.com", user.getUserType()));
        System.out.println("Admin access: " + filter.allowAccess("http://quickexample.com", admin.getUserType()));
        System.out.println("User access: " + filter.allowAccess("http://quick-to-go/hub/java.com", user.getUserType()));

        System.out.println("Admin in the website: " );
    }
}
