public class overloading_usingdatatype {
    public static int ad(int a, int b) {
        return a + b;
    }

    public static float ad(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        // ad(3, 5);
        System.out.println(ad(2f, 4f));
        // ad(3.9, 4.5)
        float result = ad(3.4f, 4.5f);
        System.out.println("Sum is float value : " + result);
    }
}