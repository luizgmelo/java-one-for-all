package academy.devdojo.javaoneforall.javacore.Ycollections.domain;

public class Smartphone {
    private String serialNumber;
    private String model;

    public Smartphone(String serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
    }

    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simétrico: para x e y diferentes de null, se x.equals(y) == true, logo y.equals(x) == true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) == true e x.equals(z) == true logo, y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true para x diferente de null
    // para x diferente de null, x.equals(null) retorna false
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;

        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
