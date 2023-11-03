package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    // Параметризованный тест
    @ParameterizedTest
    @CsvFileSource(resources = "/range.csv")
    //А можно как выше подгрузить данные из созданного нами в тестовой папке документа формата .csv где данных будет много, но мешать они не будут
    //@CsvSource ({"200,300,3", "300,500,5", "10,90,0", "10000,11000,0"}) - можно прописать так, если данных не очень много
    public void shouldCheckTheSelectionRules(int a, int b, int expected) {
        SQRService service = new SQRService();
        int actual = service.SQRCalculate(a, b);
        assertEquals(expected, actual);
    }


    //Как выглядит обычный стандартный тест
    @Test
    public void shouldCheckTheSelectionRules() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.SQRCalculate(200, 300);
        assertEquals(expected, actual);
    }
}