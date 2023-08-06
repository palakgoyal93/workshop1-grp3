package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NameRepositoryEx {
    static String[] names = {"Palak Goyal", "Deepa Singh", "Seema Sharma"};

    public static void main(String[] args) {


        String foundName = find("Deepa Singh");
        if (foundName != null) {
            System.out.println("Found name is: " + foundName);

        } else {
            System.out.println("Name not found");
        }

        Boolean addedName = add("Deepa Singh");
        System.out.println("Added Name: " + addedName);


        String[] foundFirstName = findByFirstName("Palak");
        System.out.println("First name is: " + foundFirstName[0]);
        
        String[] foundLastName = findByLastName("Goyal");
        System.out.println("Last name is: " + foundLastName[1]);
    }

    public static boolean add(final String fullName) {
        if (find(fullName) == null) {
           /*System.out.println(Arrays.stream(names).count());
            names[names.length] = fullName;
            return true;
        } else {
            return false;*/
            String[] addNames = Arrays.copyOf(names, names.length + 1);

            addNames[addNames.length - 1] = fullName;
            names = addNames;
            return true;
        } else {
            return false;
        }

    }

    public static String find(final String fullName) {
        for (String newName : names) {
            if (newName == fullName) {
                return newName;
            }
        }
        return null;
    }

    public static String[] findByFirstName(final String firstName) {
        String[] storeValue = new String[names.length];
        for (String str : names) {
            String[] splitName = str.split(" ");
            if (splitName[0].equals(firstName)) {
                storeValue[0] = firstName;
                return storeValue;
            }
        }
        return null;
    }
        public static String[] findByLastName(final String lastName){
            String[] lastNameStore = new String[names.length];
            for (String str : names) {
                String[] splitName = str.split(" ");
                if (splitName[1].equals(lastName)) {
                    lastNameStore[1] = lastName;
                    return lastNameStore;
                }

            }

            return null;
        }
    }