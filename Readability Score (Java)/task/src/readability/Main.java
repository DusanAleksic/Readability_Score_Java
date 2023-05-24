package readability;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static boolean isVowel(char char1){
        return char1 == 'a' || char1 == 'e' || char1 == 'i' || char1 == 'o' || char1 == 'u' ||
                char1 == 'y';
    }
    public static void displayAriIndex(double ariScore){
        if(ariScore<1)
            System.out.printf("\nAutomated Readability Index: %.2f (about 6-year-olds).",ariScore);
        else if(ariScore<2)
            System.out.printf("\nAutomated Readability Index: %.2f (about 7-year-olds).",ariScore);
        else if(ariScore<3)
            System.out.printf("\nAutomated Readability Index: %.2f (about 8-year-olds).",ariScore);
        else if(ariScore<4)
            System.out.printf("\nAutomated Readability Index: %.2f (about 9-year-olds).",ariScore);
        else if(ariScore<5)
            System.out.printf("\nAutomated Readability Index: %.2f (about 10-year-olds).",ariScore);
        else if(ariScore<6)
            System.out.printf("\nAutomated Readability Index: %.2f (about 11-year-olds).",ariScore);
        else if(ariScore<7)
            System.out.printf("\nAutomated Readability Index: %.2f (about 12-year-olds).",ariScore);
        else if(ariScore<8)
            System.out.printf("\nAutomated Readability Index: %.2f (about 13-year-olds).",ariScore);
        else if(ariScore<9)
            System.out.printf("\nAutomated Readability Index: %.2f (about 14-year-olds).",ariScore);
        else if(ariScore<10)
            System.out.printf("\nAutomated Readability Index: %.2f (about 15-year-olds).",ariScore);
        else if(ariScore<11)
            System.out.printf("\nAutomated Readability Index: %.2f (about 16-year-olds).",ariScore);
        else if(ariScore<12)
            System.out.printf("\nAutomated Readability Index: %.2f (about 17-year-olds).",ariScore);
        else if(ariScore<13)
            System.out.printf("\nAutomated Readability Index: %.2f (about 18-year-olds).",ariScore);
        else if(ariScore<14)
            System.out.printf("\nAutomated Readability Index: %.2f (about 18-22-year-olds).",ariScore);
    }
    public static void displayFkIndex(double fkScore){
        if(fkScore<1)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 6-year-olds).",fkScore);
        else if(fkScore<2)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 7-year-olds).",fkScore);
        else if(fkScore<3)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 8-year-olds).",fkScore);
        else if(fkScore<4)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 9-year-olds).",fkScore);
        else if(fkScore<5)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 10-year-olds).",fkScore);
        else if(fkScore<6)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 11-year-olds).",fkScore);
        else if(fkScore<7)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 12-year-olds).",fkScore);
        else if(fkScore<8)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 13-year-olds).",fkScore);
        else if(fkScore<9)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 14-year-olds).",fkScore);
        else if(fkScore<10)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 15-year-olds).",fkScore);
        else if(fkScore<11)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 16-year-olds).",fkScore);
        else if(fkScore<12)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 17-year-olds).",fkScore);
        else if(fkScore<13)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 18-year-olds).",fkScore);
        else if(fkScore<14)
            System.out.printf("\nFlesch–Kincaid readability tests: %.2f (about 22-year-olds).",fkScore);
    }

    public static void displaySmogIndex(double smogScore){
        if(smogScore<1)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 6-year-olds).",smogScore);
        else if(smogScore<2)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 7-year-olds).",smogScore);
        else if(smogScore<3)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 8-year-olds).",smogScore);
        else if(smogScore<4)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 9-year-olds).",smogScore);
        else if(smogScore<5)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 10-year-olds).",smogScore);
        else if(smogScore<6)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 11-year-olds).",smogScore);
        else if(smogScore<7)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 12-year-olds).",smogScore);
        else if(smogScore<8)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 13-year-olds).",smogScore);
        else if(smogScore<9)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 14-year-olds).",smogScore);
        else if(smogScore<10)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 15-year-olds).",smogScore);
        else if(smogScore<11)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 16-year-olds).",smogScore);
        else if(smogScore<12)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 17-year-olds).",smogScore);
        else if(smogScore<13)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 18-year-olds).",smogScore);
        else if(smogScore<14)
            System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about 18-22-year-olds).",smogScore);
    }

    public static void displayClIndex(double clScore){
        if(clScore<1)
            System.out.printf("\nColeman–Liau index: %.2f (about 6-year-olds).\n",clScore);
        else if(clScore<2)
            System.out.printf("\nColeman–Liau index: %.2f (about 7-year-olds).\n",clScore);
        else if(clScore<3)
            System.out.printf("\nColeman–Liau index: %.2f (about 8-year-olds).\n",clScore);
        else if(clScore<4)
            System.out.printf("\nColeman–Liau index: %.2f (about 9-year-olds).\n",clScore);
        else if(clScore<5)
            System.out.printf("\nColeman–Liau index: %.2f (about 10-year-olds).\n",clScore);
        else if(clScore<6)
            System.out.printf("\nColeman–Liau index: %.2f (about 11-year-olds).\n",clScore);
        else if(clScore<7)
            System.out.printf("\nColeman–Liau index: %.2f (about 12-year-olds).\n",clScore);
        else if(clScore<8)
            System.out.printf("\nColeman–Liau index: %.2f (about 13-year-olds).\n",clScore);
        else if(clScore<9)
            System.out.printf("\nColeman–Liau index: %.2f (about 14-year-olds).\n",clScore);
        else if(clScore<10)
            System.out.printf("\nColeman–Liau index: %.2f (about 15-year-olds).\n",clScore);
        else if(clScore<11)
            System.out.printf("\nColeman–Liau index: %.2f (about 16-year-olds).\n",clScore);
        else if(clScore<12)
            System.out.printf("\nColeman–Liau index: %.2f (about 17-year-olds).\n",clScore);
        else if(clScore<13)
            System.out.printf("\nColeman–Liau index: %.2f (about 18-year-olds).\n",clScore);
        else if(clScore<14)
            System.out.printf("\nColeman–Liau index: %.2f (about 18-22-year-olds).\n",clScore);
        else
            System.out.printf("\nColeman–Liau index: %.2f (about 18-22-year-olds).\n",clScore);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("The text is:");
        String string1 = Files.readString(Path.of(args[0]));
        System.out.println(string1);
        string1 = string1.toLowerCase(  );
        String split[] = string1.split("[.!?]");
        int whitespaceCount=0;
        int wordCount=0;

        for(int i=0;i< split.length;i++){
            split[i]=split[i].trim();
        }

        int vowelCount=0;
        int vowelPerWordCount=0;
        int pollysylablesCount=0;
        for(int i=0;i< split.length;i++){
            for(int j=0;j<split[i].length()-1;j++){
                if(Character.isWhitespace(split[i].charAt(j)))
                    whitespaceCount++;
                if(!(split[i].charAt(j) == 'e' && Character.isWhitespace(split[i].charAt(j+1)))){
                    if(isVowel(split[i].charAt(j)) && !isVowel(split[i].charAt(j+1))){
                        vowelCount++;
                        vowelPerWordCount++;
                    }
                    else if(isVowel(split[i].charAt(j)) && isVowel(split[i].charAt(j+1))){
                        vowelCount++;
                        vowelPerWordCount++;
                        j++;
                    }
                }
                if(Character.isWhitespace(split[i].charAt(j))){
                    if(vowelPerWordCount>2)
                        pollysylablesCount++;
                    if( vowelPerWordCount == 0)
                        vowelCount++;
                    else
                        vowelPerWordCount=0;
                }
            }
            whitespaceCount++;
        }
        wordCount=whitespaceCount;

        double characters = string1.length()-wordCount+1;
        double ariScore = 4.71 * characters/wordCount+ 0.5*wordCount/split.length-21.43;
        double fkScore = 0.39* wordCount/split.length + 11.8*vowelCount/wordCount - 15.59;
        double smogScore = 1.043 * Math.sqrt((double) pollysylablesCount*30/split.length) + 3.1291;
        double clScore = 0.0588*characters/wordCount*100-0.296*split.length/wordCount*100-15.8;
        String test = "This is the page of the Simple English Wikipedia. A place where people work together to write encyclopedias in different languages. That includes children and adults who are learning English. There are 142,262 articles on the Simple English Wikipedia. All of the pages are free to use. They have all been published under both the Creative Commons License 3 and the GNU Free Documentation License. You can help here! You may change these pages and make new pages. Read the help pages and other good pages to learn how to write pages here. You may ask questions at Simple talk.";

        System.out.println("\nWords: "+wordCount);
        System.out.println("Sentences: "+split.length);
        System.out.println("Characters: "+(string1.length()-wordCount+1));
        System.out.println("Syllables: "+vowelCount);
        System.out.println("Polysyllables: "+pollysylablesCount);
        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals("ARI")){
            displayAriIndex(ariScore);
        }
        if(input.equals("FK")){
            displayFkIndex(fkScore);
        }
        if(input.equals("SMOG")){
            displaySmogIndex(smogScore);
        }
        if(input.equals("CL")){
            displayClIndex(ariScore);
        }
        if(input.equals("all")){
            displayAriIndex(ariScore);
            displayFkIndex(fkScore);
            displaySmogIndex(smogScore);
            displayClIndex(clScore);
        }
    }
}
