public int solution (int N) {
    String binary = Integer.toString (N, 2);
    int largestGap = 0;
    for (int i = 1, gap = 0;
    i < binary.length (); i ++) {
        while (i < binary.length () && binary.charAt (i) == '0') {
            i ++;
            gap ++;
        }
        if (gap > largestGap && i < binary.length ()) {
            largestGap = gap;
        }
        gap = 0;
    }
    return largestGap;
}



public class Main {
    static int MAX = 0;
    static int COUNT = 0;

    public static void counter(char ch) {
        if(ch == '1') {
            if(MAX < COUNT)
                MAX = COUNT;
            COUNT = 0;
        } else
            COUNT++;
    }

    public static void solution(int N) {
        if(N != 0) {
            counter(N % 2 == 0 ? '0' : '1');
            solution(N / 2);
        }
    }

    public static void main(String[] args) {
        solution(32);
        System.out.println(MAX);
    }
}


