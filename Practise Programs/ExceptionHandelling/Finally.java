public class Finally {
    public static void main(String[] args) {
        try {
            int x = 20 / 0;
            System.out.println(x);
        }
        catch (ArithmeticException e) {
            System.out.println("Error occurred");
        }
        finally {
            System.out.println("This block always executes");
        }
    }
}
