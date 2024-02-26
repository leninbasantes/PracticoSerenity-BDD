package org.nttdata;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVDataLoader {

    public static List<String[]> leerDatosCSV(String archivo) throws IOException, CsvValidationException {
        try (CSVReader reader = new CSVReader(new FileReader(archivo))) {
            List<String[]> datos = reader.readAll();
            return datos;
        } catch (CsvException e) {
            throw new RuntimeException(e);
        }
    }
}
