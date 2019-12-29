package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File inputFile = new File("input_year.txt");
        File outputFile = new File("output_date.txt");
        Date date = new Date();
        SimpleDateFormat dateFromFile = new SimpleDateFormat("D:yyyy");
        SimpleDateFormat dateToFile = new SimpleDateFormat("dd:MM:yyyy");
        String dateTextYear = "";


        try (Scanner sc = new Scanner(inputFile)) {
            dateTextYear = sc.nextLine();
        }catch (IOException e){
            System.out.println(e);
        }

        System.out.println("Setting year from file (input_year.txt) = " + dateTextYear);
        dateTextYear = "256:"+dateTextYear;

        try {
            date = dateFromFile.parse(dateTextYear);
        }catch (ParseException e){
            System.out.println(e);
        }

        String dateTextResult = dateToFile.format(date);


        System.out.println("Date of fiesta = " + dateTextResult+ " saved to output_date.txt");

        try(PrintWriter outputData = new PrintWriter("output_date.txt")){
            outputData.println(dateTextResult);
        }catch (IOException e){
            System.out.println("Error file write");
        }

    }

}
