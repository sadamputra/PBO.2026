package UTS.Soal01;

public class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public boolean validate() {
        return city != null && !city.isEmpty();
    }

    public String outputAsLabel() {
        return street + ", " + city + ", " + country;
    }
}