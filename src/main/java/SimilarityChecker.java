public class SimilarityChecker {

    public double getLengthSimilarity(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int longer = Math.max(len1, len2);
        int shorter = Math.min(len1, len2);

        double ratio = (double) (longer - shorter) / shorter;
        return getResult(ratio);
    }

    private double getResult(double ratio) {
        double result = (1 - ratio) * 60;
        if(result < 0) result =0;
        return result;
    }
}
