package be.intectbrussel;

public class MainApp {
    public static void main(String[] args) {

        // arithmetic operators (+, -, *, /)
        // +
        int x = 10;
        int y = 5;
        int z = x + y;
        System.out.println(z);

        // -
        z = x - y;
        System.out.println(z);
        System.out.println(x - y);

        // * => maal
        z = x * y;
        System.out.println(z);

        // / => delen
        z = x / y;
        System.out.println(z);

        // ++ => plus 1
        // k++ => eerst toekennen aan l dan optellen
        int i = 10;
        System.out.println("i => " +i);
        i++;
        System.out.println("i => " +i);

        // ++k => eerst optelen dan toekennen aan l
        int k = 10;
        int l = ++k;
        System.out.println(l);

        // -- => min 1
        int j = 10;
        j--;
        System.out.println(j);

        // demo
        int o = 10;
        int p = ++o;
        System.out.println("p is : " +p);
        System.out.println("o is : " +o);

        // of

        int q = 10;
        int w = q++;
        System.out.println("w is : " +w);
        System.out.println("q is : " +q);

        // modulo operator => rest waarde
        x = 10;
        y = 3;
        z = x % y; // de rest waarde is 1
        System.out.println("rest waarde " +z);

        // relational operators (==, !=, <, >, <=, >=)
        // == -> gelijk aan
        x = 20;
        y = 20;
        boolean result = x == y;
        System.out.println("x == y : " +result);

        // != => niet gelijk aan
        x = 10;
        y = 15;
        result = x != y;
        System.out.println("x != y : " + result);

        // < => kleiner dan
        x = 10;
        y = 100;
        result = x < y;
        System.out.println("x < y : " +result);

        // > => groter dan
        x = 90;
        y = 8;
        result = x > y;
        System.out.println("x > y : " +result);

        // (<=) => kleiner of gelijk aan
        x = 7;
        y = 9;
        result = x <= y;
        System.out.println("x <= y : " + result);

        // (>=) => groter dan of gelijk aan
        x = 54;
        y = 8;
        result = x >= y;
        System.out.println("x >= y : " + result);

        // logical operators (&&) And - (||)  Or (!) Not

        // && => AND
        boolean g = true;
        boolean h = false;
        result = g && h;
        // both left hand and right hand must be true -> to return true
        System.out.println("g && h : " + result);

        // || => OR
        g = true;
        h = false;
        result = g || h;
        // if left or right hand is true -> result true
        System.out.println("g || h : " + result);

        // ! => NOT
        g = true;
        result = !g;
        System.out.println("!g : " + result);

        result = !(10 < 1);
        System.out.println("!(10 < 1) : " + result);

        // assignment operators =, -=, +=, *=, /=, %=
        // = => toekenningsteken
        int a = 10;

        // += => toevoegen en toekennen
        int n = 4;
        int m = 6;

        m += n; // korte notatie
        //m = m + n; // lange notatie

        // deze lijn is commentar en wordt niet uitgevoerd

        System.out.println("m += n : " + m);

        // -= =>  aftrekken en toekennen
        n = 7;
        m = 00;

        m -= n; // korte notatie
        // m = m - n; // lange notatie
        System.out.println("m -= n : " + m);

        // *= => vermenivuldigen en toekennen

        n = 10;
        m = 2;

        m *= n; // korte notatie
        // m = m * n; // lange notatie
        System.out.println("m *= n : " + m);

        // (/) => delen en toekennen;
        n = 2;
        m = 100;

        m /= n; // korte notatie
        // m = m / n; lange notatie
        System.out.println("m /= n : " + m);

        // %= restant en toekennen
        n = 10;
        m = 3;

        n %= m; // korte notatie
        // n = n % m; // lange notatie

        System.out.println("n %= m : " +n);

        // combinatie
        x = 10;
        y = 5;
        boolean res = (x > y) && (x < 20);
        System.out.println("(x > y) && (x < 20) : " +res);

        x = 10;
        y = 5;
        res = (x < y) || (x > 20);
        System.out.println("(x < y) || (x > 20) : " + res);
    }
}
