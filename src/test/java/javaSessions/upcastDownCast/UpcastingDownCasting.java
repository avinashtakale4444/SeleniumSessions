package javaSessions.upcastDownCast;


public class UpcastingDownCasting {
    public static void main(String[] args) {
        Parent p=new Parent();
        Child c=new Child();
        c.display();
        p.display();
        System.out.println("#################");
        Parent p1=new Child();
        p1.display();

    }
}
