
import java.util.ArrayList;
import java.util.Scanner;

public class DB {

    private Scanner reader;
    private ArrayList<Bird> lista;

    DB(Scanner reader) {
        this.lista = new ArrayList<Bird>();
        this.reader = reader;
    }

    public void Add() {
        System.out.print("Name: ");
        String ime = reader.nextLine();
        System.out.print("Latin Name: ");
        String lat = reader.nextLine();
        lista.add(new Bird(ime, lat));
    }

    public int Observation() {
        System.out.print("What was observed:? ");
        String temp = reader.nextLine();
        for (Bird i : lista) {
            if (i.getName().equals(temp)) {
                i.increaseObservation();
                return 0;
            }
        }
        System.out.println("It is not a bird!");
        return 0;
    }

    public void Statistics() {
        for (Bird i : lista) {
            System.out.println(i.toString());
        }
    }

    public int Show() {
        System.out.print("What? ");
        String temp = reader.nextLine();
        for (Bird i : lista) {
            if (i.getName().equals(temp)) {
                System.out.println(i.toString());
                return 0;
            }
        }
        System.out.println("It is not a bird!");
        return 0;
    }

    public void Menu() {
        String temp = "0";
        while (!temp.equals("Quit")) {
            System.out.println("?");
            temp = reader.nextLine();
            if (temp.equals("Add")) {
                Add();
            }
            if (temp.equals("Observation")) {
                Observation();
            }
            if (temp.equals("Statistics")) {
                Statistics();
            }
            if (temp.equals("Show")) {
                Show();
            }
        }
    }
}
