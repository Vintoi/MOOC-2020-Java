
public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
Lyhenteet lyhenteet = new Lyhenteet();
lyhenteet.lisaaLyhenne("ok", "olipa kerran");
lyhenteet.lisaaLyhenne("jne", "ja niin edelleen");
System.out.println(lyhenteet.onkoLyhennetta("lol"));
System.out.println(lyhenteet.onkoLyhennetta("jne"));
System.out.println(lyhenteet.haeLyhenne("jne"));
    }
}
