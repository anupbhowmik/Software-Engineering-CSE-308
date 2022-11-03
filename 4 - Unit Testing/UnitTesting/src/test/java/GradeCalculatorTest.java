import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {
    static GradeCalculator gradeSys;

    @BeforeAll
    public static void init(){
        System.out.println("Tests starting...");
        gradeSys = new GradeCalculator();
    }

    // CREDIT 3
    // GENERAL CASES
    @Test
    void credit3gradeABasic(){
        assertEquals("A", gradeSys.credit3gradeCalculator("259"));
    }
    @Test
    void credit3gradeBBasic(){
        assertEquals("B", gradeSys.credit3gradeCalculator("220"));
    }
    @Test
    void credit3gradeCBasic(){
        assertEquals("C", gradeSys.credit3gradeCalculator("190"));
    }
    @Test
    void credit3gradeFBasic(){
        assertEquals("F", gradeSys.credit3gradeCalculator("170"));
    }

    @Test
    void credit3gradeABasicFrac(){
        assertEquals("A", gradeSys.credit3gradeCalculator("259.01"));
    }
    @Test
    void credit3gradeBBasicFrac(){
        assertEquals("B", gradeSys.credit3gradeCalculator("220.09"));
    }
    @Test
    void credit3gradeCBasicFrac(){
        assertEquals("C", gradeSys.credit3gradeCalculator("190.5"));
    }
    @Test
    void credit3gradeFBasicFrac(){
        assertEquals("F", gradeSys.credit3gradeCalculator("170.59"));
    }

    // INVALID INPUT
    @Test
    void credit3InvalidInput(){
        assertThrows(NumberFormatException.class, () -> {
            gradeSys.credit3gradeCalculator("abd");
        });
    }
    @Test
    void credit3LessThanZeroCorner(){
        // BONUS CASE
        assertThrows(IllegalArgumentException.class, () -> {
            gradeSys.credit3gradeCalculator("-0.5");
        });
    }
    @Test
    void credit3LessThanZeroBasic(){
        assertThrows(IllegalArgumentException.class, () -> {
            gradeSys.credit3gradeCalculator("-10.55");
        });
    }
    @Test
    void credit3GreaterThan400Corner(){
        // BONUS CASE
        assertThrows(IllegalArgumentException.class, () -> {
            gradeSys.credit3gradeCalculator("400.54");
        });
    }
    @Test
    void credit3GreaterThan400Basic(){
        assertThrows(IllegalArgumentException.class, () -> {
            gradeSys.credit3gradeCalculator("450.4");
        });
    }


    // CORNER CASES
    @Test
    void credit3gradeAUpperBound(){
        assertEquals("A", gradeSys.credit3gradeCalculator("399.5"));
    }
    @Test
    void credit3gradeALowerBound(){
        assertEquals("A", gradeSys.credit3gradeCalculator("239.01"));
    }
    @Test
    void credit3gradeBUpperBound(){
        assertEquals("B", gradeSys.credit3gradeCalculator("238.88"));
    }
    @Test
    void credit3gradeBLowerBound(){
        assertEquals("B", gradeSys.credit3gradeCalculator("238.88"));
    }
    @Test
    void credit3gradeCUpperBound(){
        assertEquals("C", gradeSys.credit3gradeCalculator("208.1"));
    }
    @Test
    void credit3gradeCLowerBound(){
        assertEquals("C", gradeSys.credit3gradeCalculator("179.99"));
    }
    @Test
    void credit3gradeFUpperBound(){
        assertEquals("F", gradeSys.credit3gradeCalculator("178.33"));
    }
    @Test
    void credit3gradeFZero(){
        // BONUS CASE
        assertEquals("F", gradeSys.credit3gradeCalculator("0"));
    }


    // CREDIT 4
    // GENERAL CASES
    @Test
    void credit4gradeABasic(){
        assertEquals("A", gradeSys.credit4gradeCalculator("340"));
    }
    @Test
    void credit4gradeBBasic(){
        assertEquals("B", gradeSys.credit4gradeCalculator("290"));
    }
    @Test
    void credit4gradeCBasic(){
        assertEquals("C", gradeSys.credit4gradeCalculator("250"));
    }
    @Test
    void credit4gradeFBasic(){
        assertEquals("F", gradeSys.credit4gradeCalculator("230"));
    }

    @Test
    void credit4gradeABasicFrac(){
        assertEquals("A", gradeSys.credit4gradeCalculator("340.01"));
    }
    @Test
    void credit4gradeBBasicFrac(){
        assertEquals("B", gradeSys.credit4gradeCalculator("290.09"));
    }
    @Test
    void credit4gradeCBasicFrac(){
        assertEquals("C", gradeSys.credit4gradeCalculator("250.5"));
    }
    @Test
    void credit4gradeFBasicFrac(){
        assertEquals("F", gradeSys.credit4gradeCalculator("230.59"));
    }

    // INVALID INPUT
    @Test
    void credit4InvalidInput(){
        assertThrows(NumberFormatException.class, () -> {
            gradeSys.credit4gradeCalculator("abd");
        });
    }
    @Test
    void credit4LessThanZeroCorner(){
        // BONUS CASE
        assertThrows(IllegalArgumentException.class, () -> {
            gradeSys.credit4gradeCalculator("-0.5");
        });
    }
    @Test
    void credit4LessThanZeroBasic(){
        assertThrows(IllegalArgumentException.class, () -> {
            gradeSys.credit4gradeCalculator("-10.55");
        });
    }
    @Test
    void credit4GreaterThan400Corner(){
        // BONUS CASE
        assertThrows(IllegalArgumentException.class, () -> {
            gradeSys.credit4gradeCalculator("400.54");
        });
    }
    @Test
    void credit4GreaterThan400Basic(){
        assertThrows(IllegalArgumentException.class, () -> {
            gradeSys.credit4gradeCalculator("450.4");
        });
    }

    // CORNER CASES
    @Test
    void credit4gradeAUpperBound(){
        assertEquals("A", gradeSys.credit4gradeCalculator("399.5"));
    }
    @Test
    void credit4gradeALowerBound(){
        assertEquals("A", gradeSys.credit4gradeCalculator("319.01"));
    }
    @Test
    void credit4gradeBUpperBound(){
        assertEquals("B", gradeSys.credit4gradeCalculator("318.88"));
    }
    @Test
    void credit4gradeBLowerBound(){
        assertEquals("B", gradeSys.credit4gradeCalculator("279.88"));
    }
    @Test
    void credit4gradeCUpperBound(){
        assertEquals("C", gradeSys.credit4gradeCalculator("278.1"));
    }
    @Test
    void credit4gradeCLowerBound(){
        assertEquals("C", gradeSys.credit4gradeCalculator("239.99"));
    }
    @Test
    void credit4gradeFUpperBound(){
        assertEquals("F", gradeSys.credit4gradeCalculator("238.33"));
    }
    @Test
    void credit4gradeFZero(){
        // BONUS CASE
        assertEquals("F", gradeSys.credit4gradeCalculator("0"));
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("Test ended.");
        gradeSys = null;
    }
}