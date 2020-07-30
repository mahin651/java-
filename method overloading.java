public class methodoverload {
    void add(int a, int b) {
        System.out.println("Sum of two=" + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three=" + (a + b + c));
    }


    public static void main(String args[]) {
        methodoverload m = new methodoverload();
        m.add(2,3);
        m.add(2,3,4);
    }

}





