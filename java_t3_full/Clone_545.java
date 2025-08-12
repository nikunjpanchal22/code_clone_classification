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
   String inputString = "(A,Name1,200), (A,Name1,200), (R,Name1,200), (A,Name2,900), (A,Name2,500)";
   String[] splitInputString = inputString.split("\\),");
   List<Score> scorerDataList  = new ArrayList<>();
   for(String scorer : splitInputString) { 
       scorer = scorer.trim();
       int closeBraceLocator = scorer.indexOf(")");
       if(closeBraceLocator == scorer.length() - 1) {
           scorer = scorer.substring(1, scorer.length() - 1);
       }
       String[] splitScorer = scorer.split(","); 
       scorerDataList.add(new Score(splitScorer[0], splitScorer[1], Double.valueOf(splitScorer[2])));
   }
}


