import algodat.ISearchString;

public class BruteForceStringMatch implements ISearchString {

    @Override
    public int stringMatch(String string, String search) {
        for (int i = 0; i < string.length() - search.length(); i++) {
            int j = 0;
            while (j < search.length() && string.charAt(i + j) == search.charAt(j)) {
                j++;
                if (j == search.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}
