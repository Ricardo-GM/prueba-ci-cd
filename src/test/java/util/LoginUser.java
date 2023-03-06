package util;

public enum LoginUser {

    VALID_USER("hlopezbu@intercorp.com.pe", "#Interbank2021"),
    INVALID_USER("foobar", "foobar");

    public final String username;
    public final String password;

    LoginUser(String username, String password){
        this.password = password;
        this.username = username;
    }
}
