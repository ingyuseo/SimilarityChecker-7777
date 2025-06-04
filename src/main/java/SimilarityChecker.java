public class SimilarityChecker {

    public double getLengthSimilarity(String str1, String str2) {
        int longer_len;
        int shorter_len;

        if(str1.length() > str2.length()){
            longer_len = str1.length();
            shorter_len = str2.length();
        }
        else{
            longer_len = str2.length();
            shorter_len = str1.length();
        }

        int gap = longer_len - shorter_len;
        double ratio = (double) gap /shorter_len;
        if(ratio > 1 ) ratio = 1;
        return (1-ratio)*60;
    }
}
