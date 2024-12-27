public class IndexOfTheFirstOccurrenceInString28 {

    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) return -1;

        return haystack.indexOf(needle);

    }


    public int strStr1(String haystack, String needle) {
        for(int i=0, j = needle.length(); i <= haystack.length() - needle.length();  i++, j++){
            if(haystack.substring(i,j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] arg){
        IndexOfTheFirstOccurrenceInString28 index = new IndexOfTheFirstOccurrenceInString28();
        System.out.println(index.strStr1("sa1dbutsad", "sad"));
        System.out.println(index.strStr("sa1dbutsad", "sad"));

    }
}
