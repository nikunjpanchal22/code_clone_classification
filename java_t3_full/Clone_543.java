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
    double maxScore = 0.0;  
    List<Score> scoreList = new ArrayList<>();
    String[] scoreSets = ("(A,Name1,200), (A,Name1,200), (R,Name1,200), (A,Name2,900), (A,Name2,500)").split ("\\),"); 
    for(String score : scoreSets) {
        score = score.trim().substring (1);
        int closeBrace = score.indexOf( ')' );
        if (closeBrace == score.length() - 1) {
            score = score.substring (0, score.length() - 1);
        }
        String[] tokens = score.split (",");
        scoreList.add (new Score(tokens[0], tokens[1], Double.valueOf(tokens[2])));
        if(maxScore < Double.valueOf(tokens[2])) {
            maxScore = Double.valueOf(tokens[2]);
        }
    }
}  

 public static void main(String[] args) {
    String inputString = "(A,Name1,200), (A,Name1,200), (R,Name1,200), (A,Name2,900), (A,Name2,500)";
    List<Score> myScoreList = new ArrayList<Score>();
    String[] scoreSets = inputString.split ("\\),");
    int sizeOfString = scoreSets.length;
    System.out.println(sizeOfString);
    for (String score : scoreSets) {
        String str = score.substring(1,score.length());

        String[] tokens = str.split(",");
        myScoreList.add(new Score(tokens[0], tokens[1], Double.valueOf(tokens[2])));
    }
}


