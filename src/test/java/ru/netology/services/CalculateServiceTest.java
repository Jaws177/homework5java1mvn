package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculateServiceTest {

    //@ParameterizedTest
    //@CsvFileSource(files = "src/test/resources/CalculateData.csv")
    //public void calculateServiceAutoTest(int expected, int income, int expenses, int threshold) {
    //CalculateService service = new CalculateService();

    //int actual = service.calculate(income, expenses, threshold);

    //Assertions.assertEquals(expected, actual);
    @Test
    public void calculateServiceTestSampleFirst() {
        CalculateService service = new CalculateService();
        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void calculateServiceTestSampleSecond() {
        CalculateService service = new CalculateService();
        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }
}