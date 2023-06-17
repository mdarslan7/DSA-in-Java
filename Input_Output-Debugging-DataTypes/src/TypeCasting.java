public class TypeCasting {
    public static void main(String[] args) {
        float a =  97f;
        System.out.println(a);

        //Type casting
        int b = (int) 67.2;
        System.out.println(b);

        //Automatic type promotion in expressions
        int q = 257;
        byte w = (byte) q;   // 257 % 256 = 1
        System.out.println(w);

        byte x = 50;
        byte y = 20;
        byte z = 100;
        int d = x * y / z;
        System.out.println(d);

/*
        byte r = 50;
        r = r * 2;    //Can't Assign int to byte
*/
    }
}
