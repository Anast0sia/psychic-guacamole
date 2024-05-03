package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.*;
import com.opencsv.exceptions.CsvException;

public class Main {
    public static void main(String[] args) throws IOException, CsvException {
        CSVParser parser = new CSVParserBuilder()
                .withSeparator('|')
                .build();
        CSVReader reader = new CSVReaderBuilder(new FileReader("staff.csv"))
                .withCSVParser(parser)
                .build();
        List<String[]> str = reader.readAll();
        str.forEach(s -> System.out.println(Arrays.toString(s)));
    }
}