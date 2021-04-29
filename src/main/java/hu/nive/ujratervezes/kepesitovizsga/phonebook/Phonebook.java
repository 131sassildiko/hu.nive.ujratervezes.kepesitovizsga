package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private String firstName;
    private String lastName;
    private String number;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNumber() {
        return number;
    }
    Map<String, String> contacts = new HashMap<>();

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

    public void exportPhonebook(Map<String, String> contacts, String output) {

            Path file = Path.of("phonebookOutput.txt");
            try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))){
                phonebook.getNumber()= String output;


                    writer.print (firstName);
                    writer.print (lastName);
                    writer.print (":");
                    writer.println (number);

            }
            catch (IOException ioe){
                throw new IllegalStateException("Can not write file", ioe);
            }
        }

    }
}
}
