import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {
    private SimilarityChecker similarityChecker;

    @BeforeEach
    void setUp() {
        similarityChecker = new SimilarityChecker();
    }

    @Test
    void returnIfSameLength(){
        assertEquals(60, similarityChecker.getLengthSimilarity("AA","BB"));
    }

    @Test
    void returnIfDiffLengthLess2(){
        assertEquals(30, similarityChecker.getLengthSimilarity("AAAAAA","BBBB"));
    }

    @Test
    void returnIfDiffLengthOver2(){
        assertEquals(0,similarityChecker.getLengthSimilarity("AAAAAA","BB"));
    }




}