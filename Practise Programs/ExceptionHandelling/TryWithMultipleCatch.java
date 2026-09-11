public class TryWithMultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[4]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }
        catch (Exception e) {
            System.out.println("Some other error occurred");
        }
    }
}
