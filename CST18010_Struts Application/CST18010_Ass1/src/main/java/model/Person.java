package model;



public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int celsius;
    private int fahrenheit;
    private int celsius1;
    private int fahrenheit1;

    public int getCelsius1() {
        celsius1=(((fahrenheit-32)*5)/9);
        return celsius1;
    }

    public void setCelsius1(int celsius1) {
        this.celsius1 = celsius1;
    }

    public int getFahrenheit1() {
        fahrenheit1=(((celsius*9)/5)+32);
        return fahrenheit1;
    }

    public void setFahrenheit1(int fahrenheit1) {
        this.fahrenheit1 = fahrenheit1;
    }





    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "  \n You Entered fahrenheit:      " + getFahrenheit() + "  \n You Entered celsius:      " + getCelsius()  + "  \n fahrenheitconverter:      " + getFahrenheit1() + " \n celsiusconverter:      " + getCelsius1() ;
    }
}