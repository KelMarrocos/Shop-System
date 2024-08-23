package sistemaLoja.Dominio;

public class address {
    private String street;
    private String postalCode;

    public void imprime() {
        System.out.println("Street: " + this.street);
        System.out.println("Postal Code: " + this.postalCode);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
