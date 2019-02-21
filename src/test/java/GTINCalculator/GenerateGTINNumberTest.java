package GTINCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateGTINNumberTest extends GenerateGTINNumber {

    @Test
    void generateGTINNumber() {
        assertEquals("GTIN-8 : 12345670",generateGTINNumber("1234567"));
        assertEquals("Invalid Number Type.",generateGTINNumber("12345678"));
        assertEquals("GTIN-12 : 123456789005",generateGTINNumber("12345678900"));
        assertEquals("GTIN-13 : 1234567890012",generateGTINNumber("123456789001"));
        assertEquals("GTIN-14 : 12345678900197",generateGTINNumber("1234567890019"));
        assertEquals("GTIN-14 : 98989767957947",generateGTINNumber("9898976795794"));
    }
}