/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
public class App {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 20;
        int c = 0;
        
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c+"\n");
        
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a " + c);
        c -= a;
        System.out.println("c -= a " + c);
        c *= a;
        System.out.println("c *= a " + c);
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a = " + c);
        c <<= 2;
        System.out.println("c <<= 2 " + c);
        c >>= 2;
        System.out.println("c >>- 2 - " + c);
        c >>= 2;
        System.out.println("c >>= a " + c);
        c &= 2;
        System.out.println("c &= a " + c);
        c ^= 2;
        System.out.println("c ^- a - " + c);
        c |= 2;
        System.out.println("c &= 2 " + c);
    }
}
