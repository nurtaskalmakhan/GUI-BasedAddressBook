import java.util.ArrayList;

import javax.swing.*;
import java.util.*;

class PersonInfo {
    String name;
    String address;
    String phoneNumber;

    PersonInfo(String n, String a, String p) {
        name = n;
        address = a;
        phoneNumber = p;
    }

    void display() {
        JOptionPane.showMessageDialog(null, "Name: " + name + "Address: " + address + "PhNum" + phoneNumber};
    }

class AddressBook {
    ArrayList persons;

    AddressBook() {
        persons = new ArrayList();
    }

    void addPerson() {
        String name = JOptionPane.showInputDialog("EnterName");
        String add = JOptionPane.showInputDialog("EnterAdd");
        String pNum = JOptionPane.showInputDialog("EnterPh");
        // Creating
        PersonInfo p = new PersonInfo(name, add, pNum);
        persons.add(p);
    }

    void searchPerson(String n) {
        for (int i = 0; i < persons.size(); i++)  {
            PersonInfo p = (PersonInfo) persons.get(i);
            if (n.equals(p.name)) {
                p.display();
            }
        }
    }

    void deletePerson(String n) {
        for (int i = 0; i < persons.size(); i++) {
            PersonInfo p = (PersonInfo) persons.get(i);
            if (n.equals(p.name)) {
                persons.remove(i);
            }
        }
    }
}


public class Test{
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        String input, s;
        int ch;

        while (true) {
            input = JOptionPane.showMessageDialog("Show");
            ch = Integer.parseInt(input);

            switch (ch) {
                case 1:
                    ab.addPerson();
                    break;
                case 2:
                    s = JOptionPane.showInputDialog("Enter ")
                    ab.searchPerson(s);
                    break;
                case 4:
                    System.exit(0);
                }
        }
    }
}