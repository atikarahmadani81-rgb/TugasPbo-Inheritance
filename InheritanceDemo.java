public class InheritanceDemo {
     public static void main(String[] args) {
        System.out.println("= SUPERCLASS BENTUK=" );
        Bentuk b = new Bentuk("merah");
        b.printInfo();

        System.out.println("\n= SUBCLASS BUJUR SANGKAR=" );
        BujurSangkar bs = new BujurSangkar(4.0, "biru");
        bs.printInfo();

        System.out.println("\n= SUBCLASS LINGKARAN=" );
        Lingkaran l = new Lingkaran(7.0, "kuning");
        l.printInfo();

        System.out.println("\n= SUBCLASS SILINDER=" );
        Silinder s = new Silinder(10.0, 7.0, "hijau");
        s.printInfo();
    }
}
