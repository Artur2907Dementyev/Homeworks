package lesson34.classwork0406.WebadressFilter;

public interface Filter {
    boolean allowAccess(String url, UserType userType);
}
