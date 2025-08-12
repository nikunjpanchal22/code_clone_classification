public static String output (String [] fourLetter, String [] fiveLetter, String [] sixLetter) {
    String answer = "";
    int count = 1;
    for (int i = 0;
    i < Math.max (Math.max (fourLetter.length, fiveLetter.length), sixLetter.length); i ++) {
        if (sixLetter.length > i) {
            answer += sixLetter [i] + " ";
        }
        if (fiveLetter.length > i) {
            answer += fiveLetter [i] + " ";
        }
        if (fourLetter.length > i) {
            answer += fourLetter [i];
        }
        answer += "\n";
        for (int j = 0;
        j < count; j ++) {
            answer += "\t";
        }
        count ++;
    }
    return answer;
}






public static String output (String [] fourLetter, String [] fiveLetter, String [] sixLetter) {
            StringBuilder answer = new StringBuilder();
            int max = Math.max (Math.max (fourLetter.length, fiveLetter.length), sixLetter.length);
            for (int i = 0; i < max; i ++) {
                addWord(answer, sixLetter, i);
                addWord(answer, fiveLetter, i);
                addWord(answer, fourLetter, i);
                answer.append("\n");
                for (int j = 0; j <= i; j ++) {
                    answer.append("\t");
                }
            }
            return answer.toString();
        }

        public static void addWord(StringBuilder builder, String[] words, int i){
            if (words.length > i) {
                builder.append(words[i]).append(" ");
            }
}


