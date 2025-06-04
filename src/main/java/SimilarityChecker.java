public class SimilarityChecker {

    public double getLengthSimilarity(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int longer = Math.max(len1, len2);
        int shorter = Math.min(len1, len2);

        if(longer >= shorter*2) return 0;

        double ratio = (double) (longer - shorter) / shorter;
        return (1 - ratio) * 60;
    }


}
