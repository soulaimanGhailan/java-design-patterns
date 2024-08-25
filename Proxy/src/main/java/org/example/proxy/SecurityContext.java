package org.example.proxy;

public class SecurityContext {
    public static String username ;
    public static String password ;
    public static String role ;

    public static void authenticate(String us, String pw , String r) {
        username = us;
        password = pw;
        role = r;
    }
}
