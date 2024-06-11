package lesson34.classwork0406.WebadressFilter;

public class WebadressFilter implements Filter{
    @Override
    public boolean allowAccess(String url, UserType userType) {
        if (userType == UserType.ADMIN) {
            return true;
        } else if (userType == UserType.USER) {
            return url.startsWith("http://quick-to-go");
        }
        return false;
    }
}
