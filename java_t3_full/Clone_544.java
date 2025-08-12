public static void main (String [] args) {
    String input = "(A,Name1,200), (A,Name1,200), (R,Name1,200), (A,Name2,900), (A,Name2,500)";
    String [] scoreSets = input.split ("\\),");
    List < Score > scoreList = new ArrayList < Score > ();
    for (String score : scoreSets) {
        score = score.trim ().substring (1);
        int closeBrace = score.indexOf (')');
        if (closeBrace == score.length () - 1) {
            score = score.substring (0, score.length () - 1);
        }
        String [] tokens = score.split (",");
        scoreList.add (new Score (tokens [0], tokens [1], Double.valueOf (tokens [2])));
    }
}


 public static void main(String[] args) {
    List<Score> scoreDataList = new ArrayList<>();
    String inputString = "(A,Name1,200), (A,Name1,200), (R,Name1,200), (A,Name2,900), (A,Name2,500)";
    String[] data = inputString.split("\\),");
    for(String element: data) {
        String temp = element;
        temp = temp.substring(1);
        
        int index = temp.lastIndexOf(')');
        if( index == temp.length() - 1) {
            temp = temp.substring(0, temp.length()-1);
        }
        String[] score = temp.split(",");
        scoreDataList.add(new Score(score[0], score[1], Double.valueOf(score[2]))); 
    }
}


