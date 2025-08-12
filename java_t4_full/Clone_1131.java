public static void main (String [] args) {
    try {
        ArrayList < String > sentences = null;
        sentences = new ArrayList < String > ();
        sentences.add ("Mary and Meera are my classmates.");
        sentences.add ("Mary and Meera are my classmates.");
        sentences.add ("Meera and Mary are my classmates.");
        sentences.add ("Alice and Bobe are not my classmates.");
        sentences.add ("Some totally different sentence.");
        wordAnalyser (sentences);
    } catch (Exception e) {
        e.printStackTrace ();
    }
}


  public static void main (String [] args) {
    try {
        BidiMap < String, String > sentences = null;
        sentences = new TreeBidiMap < String, String > ();
        sentences.put ("Mary and Meera are my classmates.", "This is sentence 1");
        sentences.put ("Mary and Meera are my classmates.", "This is sentence 2");
        sentences.put ("Meera and Mary are my classmates.", "This is sentence 3");
        sentences.put ("Alice and Bobe are not my classmates.", "This is sentence 4");
        sentences.put ("Some totally different sentence.", "This is sentence 5");
        wordAnalyser (sentences);
    } catch (Exception e) {
        e.printStackTrace ();
    }
}


