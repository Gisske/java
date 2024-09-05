/**
 * basic_string
 */
public class basic_string {
    public static void line() {
        for (int i = 0; i < 50; i++) {
            System.out.print("=");
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Basic String in java program");
        System.out.println("============================");

        String name = "Nattapon";
        String l_name = "Sappong";
        String address = "135/21 M12 'The quality Home town' Naimunag, Chaiyaphum City";
        
        System.out.println(name + " " + l_name);
        System.out.println("The length of name " + name.length());
        System.out.println("The length of lastname " + l_name.length());
        System.out.println("Upper case name: " + name.toLowerCase());
        System.out.println(address.indexOf("The quality Home town"));

        System.out.println("============================");

        //String Array
        

    }
}