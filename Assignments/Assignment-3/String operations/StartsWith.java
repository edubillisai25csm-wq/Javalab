class Demo {
    void sample() {
        String s = "Anits College";

        System.out.println("Starts with Anits : " + s.startsWith("Anits"));
    }
}

public class StartsWith {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.sample();
    }
}