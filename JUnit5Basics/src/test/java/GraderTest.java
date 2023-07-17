import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftyNineshouldReturnsF(){
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(59));
    }
    @Test
    void sixtyNineshouldReturnsD(){
        var grader = new Grader();
        assertEquals('D',grader.determineLetterGrade(69));
    }
    @Test
    void seventyNineshouldReturnsC(){
        var grader = new Grader();
        assertEquals('C',grader.determineLetterGrade(79));
    }
    @Test
    void eightyNineshouldReturnsB(){
        var grader = new Grader();
        assertEquals('B',grader.determineLetterGrade(89));
    }
    @Test
    void nintyNineshouldReturnsA(){
        var grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(99));
    }
    @Test
    void seventyshouldReturnsC(){
        var grader = new Grader();
        assertEquals('C',grader.determineLetterGrade(70));
    }
    @Test
    void eightyshouldReturnsB(){
        var grader = new Grader();
        assertEquals('B',grader.determineLetterGrade(80));
    }
    @Test
    void nintyshouldReturnsA(){
        var grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(90));
    }
    @Test
    void sixtyshouldReturnsD(){
        var grader = new Grader();
        assertEquals('D',grader.determineLetterGrade(60));
    }
    @Test
    void zeroshouldReturnsF(){
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(0));
    }
    @Test
    void negativeoneshouldReturnsIllegalArgumentException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () ->{
                    grader.determineLetterGrade(-6);
                });

    }



}