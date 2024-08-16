public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for(int i=0; i<26; i++) {
            char c = (char) ('a' + i);
            series += c;
        }
        System.out.println(series);
    }

    //O(n2) time complexity because in every iteration, the value of series is copied
    //as new object is created because strings are immutable. We can use StringBuilder to
    //optimize as we can modify them
}
