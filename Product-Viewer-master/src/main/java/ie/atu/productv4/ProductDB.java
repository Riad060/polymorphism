package ie.atu.productv4;

public class ProductDB {
    public static Product getProduct(String productCode) {
        Product p = null;

        if (productCode.equalsIgnoreCase("java")) {
            Book b = new Book();
            b.setCode("java");

            b.setDescription("Riad Java ");

            b.setPrice(57.50);
            b.setAuthor("Riad ");
            p = b;

        } else if (productCode.equalsIgnoreCase("studios")) {
            Software s = new Software();
            s.setCode("studios");
            s.setDescription("Studio");

            s.setPrice(350.00);
            s.setVersion("2025");

            p = s;
        } else if (productCode.equalsIgnoreCase("pink")) {
            Music m = new Music();
            m.setCode("pink");
            m.setDescription("wish you were here");

            m.setPrice(8.00);

            m.setArtist("pink floyd");

            m.setLabel("culmbia");
            p = m;
        } else if (productCode.equalsIgnoreCase("rb")) {
            TV t = new TV();
            t.setCode("kdl43");
            t.setDescription("SONY ");

            t.setPrice(819.00);

            t.setScreenSize("55\"");

            t.setManufacturer("Sony");
            p = t;
        }

        return p;
    }
}