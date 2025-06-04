import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {
    @Test
    void returnIfSameLength(){
        SimilarityChecker similarityChecker = new SimilarityChecker();
        int ret = similarityChecker.getLengthSimilarity("AA","BB");

        assertEquals(ret, 60);
    }
}