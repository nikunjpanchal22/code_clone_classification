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
    String[] scoresInput = {"(A,Name1,200)", "(A,Name1,200)", "(R,Name1,200)", "(A,Name2,900)", "(A,Name2,500)"};
    List<Score> scoresList = new ArrayList<>(); 
    for (String score : scoresInput) {
        String trimmedScore = score.substring(1);
        int scoreIndex = trimmedScore.lastIndexOf("(");
        if(scoreIndex == trimmedScore.length() - 1) 
            trimmedScore = trimmedScore.substring(0, trimmedScore.length() - 1); 
        String[] splitSets = trimmedScore.trim().split(",");
        scoresList.add(new Score(splitSets[0], splitSets[1], Double.valueOf(splitSets[2])));
    }
}


