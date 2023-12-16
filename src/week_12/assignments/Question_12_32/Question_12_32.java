package week_12.assignments.Question_12_32;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;


public class Question_12_32 {
    public static void main(String[] args) {

        String url = "https://en.wikipedia.org/wiki/The_Cranberries";
        crawler(url);// Traverse the Web from the starting url
    }

    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingUrls = new ArrayList<>();
        ArrayList<String> listOfTraversedUrls = new ArrayList<>();

        listOfPendingUrls.add(startingURL);
        while (!listOfPendingUrls.isEmpty()) {
            String urlString = listOfPendingUrls.remove(0);
            if (!listOfTraversedUrls.contains(urlString)) {
                listOfTraversedUrls.add(urlString);
                System.out.println("Craw " + urlString);

                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedUrls.contains(s)) {
                        listOfPendingUrls.add(s);
                    }
                }
                System.out.println("There isn't any url that contains the word !");
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                if (line.contains("Tamagotchi")) {
                    System.out.println("The word has found!");
                    System.exit(1);
                }

                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {// Ensure that a correct URL is found
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return list;
    }
}

