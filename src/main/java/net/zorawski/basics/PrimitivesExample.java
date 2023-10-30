package net.zorawski.basics;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class PrimitivesExample {
    public static void basicInitialization() {
        // Pamiętasz jak wspominałem, że wszystko w Java jest obiektem?
        // Otóż kłamałem! Wszystko w Java jest obiektem za wyjątkiem rzeczy, które obiektem nie są. W poniższym przypadku
        // są to typy prymitywne.
        // O takich typach możesz przeczytać tutaj: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

        // Deklaracja zmiennej może przyjąć następującą postać:
        int a = 100;
        // A więc:
        // int - to typ zmiennej
        // a - nazwa zmiennej
        // = - to znak przypisania. Oznacza, że zmienna zostanie nie tylko zadeklarowana, ale też od razu zostanie
        // jej przypisana wartość (innymi słowy - zmienna zostanie zainicjowana).
        // 100 - jest to wartość, jaką zostanie zainicjalizowana. W tym miejscu mogą być różne operacje,
        // wywołania metody, albo jak w tym przypadku - literał.
        int b = 100_000;
        long c = 10000000000L;
        char d = 'a';
        byte e = 2;
        float f = 34.0f;
        double g = 343.34234;
        boolean h = false;

        // Nie zawsze trzeba inicjalizować zmienną
        int x;
        // Jednak jeżeli się jej nie zainicuje, to nie można jej użyć. Także polecenie:
        // System.out.println(x);
        // skończyłoby się błędem kompilatora
        x = 10;
        int y = x + 20;

        // Po 160 latach istnienia języka Java, autorzy zadali sobie pytanie: "Czy rzeczywiście niezbędne jest deklarowanie typu,
        // w przypadku gdy możemy wywnioskować go z przypisanej wartości?"
        // Odpowiedź na to pytanie została zarejestrowana tutaj: https://www.youtube.com/watch?v=NuN3Xo0Qzvw

        // Także zamiast deklarować typ możemy użyć słowa kluczowego "var":
        var z = x * y + 10;

        // Tutaj, sama oszczędność nie wygląda na dużą, ale czasami typy potrafią być bardzo długie:
        var list = new HashMap<String, List<Set<String>>>();
    }
}
