package javaSessions;

public class StaticBlock {
    static {
        System.out.println("setup pre requisites1");
    }
    static {
        System.out.println("launch browser");
    }
    public static void main(String[] args) {
        System.out.println("login to app");
    }
    static {
        System.out.println("setup pre requisites");
    }
}
