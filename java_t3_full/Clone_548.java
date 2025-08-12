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
    List<Score> scoreList = new ArrayList<>(); 
    String[] splitString= {"(A,Name1,200)", "(A,Name1,200)", "(R,Name1,200)", "(A,Name2,900)", "(A,Name2,500)"}; 
    for (String element : splitString) {
        String score = element.substring (1, element.length());
        int index = score.lastIndexOf(')');
        if ( index == score.length() - 1) {
            score = score.substring (0, score.length() - 1);
        }
        String[] splitScore = score.split(","); 
        scoreList.add(new Score(splitScore[0], splitScore[1], Double.valueOf(splitScore[2])));
    }
}


