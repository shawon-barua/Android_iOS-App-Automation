package utilities;

public class AppAuthentication {
    public static String appUserName;
    public static String appPassword;
    private static PropertyHandler propertyHandler;

    public AppAuthentication(){
        propertyHandler =new PropertyHandler();
        appUserName = propertyHandler.getPropertyValue("username");
        appPassword = propertyHandler.getPropertyValue("password");

    }

    public static boolean isGuest(){
        //return propertyHandler.getPropertyValue("authType")=="guest";
        return false;
    }
}
