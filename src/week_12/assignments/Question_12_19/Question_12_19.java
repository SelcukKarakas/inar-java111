package week_12.assignments.Question_12_19;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class Question_12_19 {







        public static void main(String[] args) {

            String urlString ="https://en.wikipedia.org/wiki/The_Cranberries";

            try {
                URL url = new URL(urlString);
                int wordCount = 0;
                Scanner input = new Scanner(url.openStream());

                while (input.hasNext()) {
                    String w = input.next();
                    wordCount++;
                }
                System.out.println("The total word number is " + wordCount + " in " + urlString);

            } catch (MalformedURLException ex) {
                System.out.println("Invalid URL");
            } catch (IOException ex) {
                System.out.println("I/O Errors : No such file");
            }
        }
    }

