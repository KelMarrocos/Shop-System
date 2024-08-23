package sistemaLoja.Dominio;

public class product {
    private String name;
    private double value;


    public void imprime() {
        System.out.println("Name: " + this.name);
        System.out.println("Value" + this.value);
    }

    public product(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
