
import java.util.ArrayList;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thetv
 */
public class Phonebook {

    private ArrayList<Person> lista = new ArrayList<Person>();

    public void add(String name, String number) {
        lista.add(new Person(name, number));
    }

    public void printAll() {
        for (Person i : lista) {
            System.out.println(i.toString());
        }
    }

    public String searchNumber(String name) {
        for (Person i : lista) {
            if(i.getName().equals(name)) {
                return i.getNumber();
            }
        }
        return "number not known";
    }
}
