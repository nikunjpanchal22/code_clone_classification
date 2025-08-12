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
    String text = "Length~of~this~string~will~be~printed~before~and~after~splitting";
    System.out.println ("text length: " + text.length ());
    String [] splitWords = text.split ("~", 10);
    IntStream.range(0, splitWords.length).mapToObj(i -> "splitWords[" + i + "]: (len: " + splitWords[i].length()+ ") : " + splitWords[i]).forEach(System.out::println);
}


