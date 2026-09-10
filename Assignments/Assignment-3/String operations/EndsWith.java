class Demo {
    void sample() {
        String s = "Anits College";

        System.out.println("Ends with College : " + s.endsWith("College"));
    }
}

public class EndsWith {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.sample();
    }
}
