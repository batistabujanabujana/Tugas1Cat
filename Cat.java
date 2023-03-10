/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tescat;

/**
 *
 * @author M S I
 */
public class Cat {  
    private String name;
    private double weight;
    private String age; 
    private String ras; 
    private String kelamin; 
    private String warnaRambut; 
    private String warnaMata; 
public void setWeight(String newName, double newWeight, String newAge, String newRas, String newKelamin, String newWarnaRambut, String newWarnaMata){
    
    name = newName ;  
    weight = newWeight;  
    age = newAge;  
    ras = newRas;  
    kelamin = newKelamin;  
    warnaRambut = newWarnaRambut;  
    warnaMata = newWarnaMata; 
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public String getWarnaRambut() {
        return warnaRambut;
    }

    public void setWarnaRambut(String warnaRambut) {
        this.warnaRambut = warnaRambut;
    }

    public String getWarnaMata() {
        return warnaMata;
    }

    public void setWarnaMata(String warnaMata) {
        this.warnaMata = warnaMata;
    }

    
    
}
