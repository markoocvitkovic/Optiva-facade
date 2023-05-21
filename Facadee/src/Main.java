
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.performTask();
    }
}
class Subsystem1 {
    public void operation1() {
        System.out.println("Subsystem 1: Operation 1");
    }
}

class Subsystem2 {
    public void operation2() {
        System.out.println("Subsystem 2: Operation 2");
    }
}

class Subsystem3 {
    public void operation3() {
        System.out.println("Subsystem 3: Operation 3");
    }
}

class Subsystem4 {
    public void operation4() {
        System.out.println("Subsystem 4: Operation 4");
    }
}

class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;
    private Subsystem3 subsystem3;
    private Subsystem4 subsystem4;

    public Facade() {
        subsystem1 = new Subsystem1();
        subsystem2 = new Subsystem2();
        subsystem3 = new Subsystem3();
        subsystem4 = new Subsystem4();
    }

    public void performTask() {
        System.out.println("Perform tasks...");
        subsystem1.operation1();
        subsystem2.operation2();
        subsystem3.operation3();
        subsystem4.operation4();
    }
}




