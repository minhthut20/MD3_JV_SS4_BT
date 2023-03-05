package Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.getMEDIUM());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setColor("blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
