package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NameRepositoryEx {
    static String[] names ={"Palak Goyal","Deepa Singh","Seema Sharma"};

    public static void main(String[] args) {


        String foundName = find("Deepa Singh");
        if (foundName != null){
            System.out.println("Found name is: " + foundName);

        }else {
            System.out.println("Name not found");
        }

        Boolean addedName = add("Deepa Singh");
        System.out.println("Added Name: " + addedName);

       // System.out.println(Arrays.stream(names).count());
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
        }else {
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

   /* public static String[] findByFirstName(final String firstName){
       // String[] findFirstName = NameRepository.findByfirstName();


     //   return findFirstName;
    }*/

}

