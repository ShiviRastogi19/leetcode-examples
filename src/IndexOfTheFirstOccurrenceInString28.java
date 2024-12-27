public class IndexOfTheFirstOccurrenceInString28 {

    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) return -1;

        return haystack.indexOf(needle);

    }

    public static void main(String[] arg){
        IndexOfTheFirstOccurrenceInString28 index = new IndexOfTheFirstOccurrenceInString28();
        System.out.println(index.strStr("sadbutsad", "sad"));

    }
}
