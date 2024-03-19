package generic;

public class GenericPrinterTest {
    public static void main(String[] args) {

        GenericPrinter<Plastic> powderPrinter = new GenericPrinter<Plastic>();

        powderPrinter.setMaterial(new Plastic());
        Plastic plastic = powderPrinter.getMaterial();
        System.out.println(plastic);
        powderPrinter.getMaterial().doPrinting();
        plastic.doPrinting();

//        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
//
//        powderPrinter.setMaterial(new Powder());
//        Powder powder = powderPrinter.getMaterial();
//        System.out.println(powder);
//        powderPrinter.getMaterial().doPrinting();
//        powder.doPrinting();

    }
}
