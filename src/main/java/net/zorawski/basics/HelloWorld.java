/*
Witaj świecie!
Rytuał zakończony, bogowie zaspokojeni, ale pytania pozostały.

Pomimo faktu, że wykonujemy bardzo prostą operację wyświetlenia napisu na ekranie,
tak naprawę bardzo wiele się dzieje. I przez dużą część społęczności programistycznej jest to uważan
za dużą wadę Java (tak zwany bloat).

Dla porówniania, dla wygląda ten sam kod w języku Rust:

fn main() {
    print!("Hello World!)
}

Czyli trzy linijki czystej magii! W Javie wszystko jest jednak obiektem, więc aby uruchomić program to też najpierw
trzeba zadeklarować jakąś klasę.

Teraz przejdziemy krok po kroku po naszym kodzie.
*/

package net.zorawski.basics;
// Słowo kluczowe package, wskazuje na to do jakiego pakietu należy dana klasa. O pakietach możesz myśleć jak
// o katalogach grupujących klasy. Także ta klas znajduje się w katalogu net\zorawski\basics.
// W przypadku twojego pierwszego programu może się okazać, że nie ma słówka package. Oznacza to, że klasa jest
// w pakiecie domyślnym. Taka sytuacja występuje jedynie w bardzo prostych programach.
// O pakietach opowiemy sobie przy innej okazji. Na razie niech nie przeszkadzają!

/*
Poniżej znajduje się deklaracja klasy publicznej HelloWorld. I od razu  wpadamy w tarapaty bo sporo się tu dzieje.
Q: Co to jest klasa publiczna?
A: Jest to klasa, która jest dostępna w całej aplikacji.
- Nazwa klasy i nazwa pliku musi się zgadzać.
- Może być wiele klas w jednym pliku, ale dopuszczalna jest tylko jedna klasa publiczna.
- Plik .java nie musi posiadać klasy publicznej.

Q: Jak się deklaruje klasę?
A: Syngatura deklaracji wygląda w ten sposób:
<kwantyfikator dostępu> class <nazwa klasy> {
O dostępie pogadamy sobie przy innej okazji.
Jeżeli chodzi o nazwy klasy to przyjęło się w Java, że nazwy klas:
- to rzeczowniki,
- pisane są wielką literą
- używany jest camel case

Przykład pisowni CamelCase: HelloWorldController
Przykład pisowni kebab-case: hello-world-controller
Przykład pisowni snake-case: hello_world_controller

Q: Czym jest klasa?
A: O tym szerzej powiemy trochę później. Na teraz powinnaś wiedzieć, że klasa określa typ (np. Person) a instancją klasy
jest obiekt (np. "Artur" lub "Asia").
 */
public class HelloWorld {

    /*
    Poniżej znajduje się deklaracja specjalnej metody main. Metoda main, oznacza że klasa może być uruchomiona
    jak program. Tutaj kilka uwag:
    - Sygnatura metody jest zawsze taka sama: public static void main(String[] args)
    - Różne klasy mogą mieć różne metody main. Także twój program może działać inaczej, w zależności od tego
    która klasa zostanie wywołana.

    Teraz spójrzmy na wszystkie słowa w tej linijce:
    public - oznacza, że metoda jest publiczna i każdy może ją wywołać
    static - deklaruje metodę statyczną. Oznacza to, że metodę można wywołać bez tworzenia obiektu danej klasy.
    void - jest to specjalne słowo kluczowe, oznaczające, że metoda nic nie zwraca. Jeżeli zamiast void widniałoby int
    to kompilator oczdkiwałby, że metoda zwróci liczbę całkowitą
    main - jest to nazwa metody. Metody w Java są pisane małą literą przy wykorzystaniu CamelCase (czyli np. findPerson()
    String[] args - jest to tablica Stringów o nazwie "args". W świecie Javy stringi to nuda, więc nie ma się co
    na ekscytować :/. W tym przypadku tablica args zawiera parametry przekazane do wywołania naszego programu.
     */
    public static void main(String[] args) {
        // A tutaj już sam kod odpowiedzlany za wydrukowanie tekstu na ekranie. Pewnie już zauważyłaś,
        // że nie jest to takie proste?
        // Najpierw wskazujemy klasę System. Następnie za pomocą operatora . (dot) dostajemy się do statycznego obiektu
        // out. Out reprezentuje obiekt drukujący na standardowe wyjście. A na samym końcu wywołujemy metodę println.
        // I voila! Tylko tyle trzeba, aby ożywić ekran. Jeżeli chciałabyś coś wypisać na standardowy błąd to mogłabyś
        // użyć np. System.err.println("Hello Hell!");
        System.out.println("Hello World!");
    }
}
