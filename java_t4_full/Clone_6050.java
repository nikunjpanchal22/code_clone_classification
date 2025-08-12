public static void main (String [] args) {
    String x = "flskdafsld~fdsakçkçfsda sfdaldsak~çfdskkfadsçlkçfldskçlflçfdskçldksçlkfdslçakafdslçdsklçfdskçlafdskçkdfsçlkfds~çlkfasdçlçfdls~kçlf~dksçlsakdçlkfç";
    System.out.println ("x length: " + x.length ());
    String [] lines = Split (x, 30, 210);
    for (int i = 0;
    i < lines.length; i ++) {
        System.out.println ("lines[" + i + "]: (len: " + lines [i].length () + ") : " + lines [i]);
    }
}





public static void main (String [] args) {
    String inputText = "More~Variations~For~Splitting~Strings~And~Displaying~Results";
    System.out.println ("inputText length: " + inputText.length ());
    String [] wordArray = inputText.split ("~", 4);
    IntStream.range(0, wordArray.length).mapToObj(i -> "wordArray[" + i + "]: (len: " + wordArray[i].length()+ ") : " + wordArray[i]).forEach(System.out::println);
}


