public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    public GuitarSpec getSpec() {
        //something
        return spec;
    }

    public String getSerialNumber(){
        //
        return serialNumber;
    }
    public void setPrice(float number){
        price=number;
    }

    public double getPrice(){
        return price;
    }
}
