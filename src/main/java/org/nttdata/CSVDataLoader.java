package org.nttdata;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVDataLoader {
    public static List<String[]> leerDatosCSV(InputStream inputStream) throws IOException, CsvValidationException {
        // Aquí tu lógica actual para leer el archivo CSV, pero ajustada para usar el inputStream.
        List<String[]> resultados = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new InputStreamReader(inputStream))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                resultados.add(nextLine);
            }
        }
        return resultados;
    }
}