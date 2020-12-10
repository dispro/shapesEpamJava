package by.epam.geometry.reader;

import by.epam.geometry.entity.Cone;
import by.epam.geometry.entity.Point;
import by.epam.geometry.exception.InvalidPointDataException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    private static final Logger logger = LogManager.getLogger(FileReader.class);
    private static final String FILE_PATH = "src/main/resources/data/";

    private boolean isValidPointLine(String line){
        return line.matches("[\\d+.\\d+ ]{2}");
    }

    private boolean isValidConeLine(String line){
        return line.matches("[\\d+.\\d+ ]{4}");
    }

    public List<Point> readPointSequence(String filename) throws FileNotFoundException {
        List<Point> pointList = new ArrayList<Point>();
        try (Scanner scanner = new Scanner(new File(FILE_PATH + filename))){
            String[] dataObject;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (!this.isValidPointLine(line)){
                    continue;
                }
                dataObject = line.split(" ");
                Point point = new Point(Double.parseDouble(dataObject[0]), Double.parseDouble(dataObject[1]));
                pointList.add(point);
            }
        }catch (IOException e) {
            logger.info(e.getMessage());
        }
        return pointList;
    }

    public List<Cone> readConeSequence(String filename) throws FileNotFoundException {
        List<Cone> coneList = new ArrayList<Cone>();
        try (Scanner scanner = new Scanner(new File(FILE_PATH + filename))){
            String[] dataObject;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                dataObject = line.split(" ");
                Cone cone = new Cone(Double.parseDouble(dataObject[0]),
                        Double.parseDouble(dataObject[1]),
                        Double.parseDouble(dataObject[2]),
                        Double.parseDouble(dataObject[3]));
                coneList.add(cone);
            }
        }catch (IOException e) {
            logger.info(e.getMessage());
        }
        return coneList;
    }



}
