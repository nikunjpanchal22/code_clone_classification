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
    String s = "Splitting~this~string~into~array~of~words~and~printing~length~of~each~word";
    System.out.println ("Length of the string : " + s.length ());
    String [] words = s.split ("~", 5);
    IntStream.range(0, words.length).forEach(i -> System.out.println("words[" + i + "]: (len: " + words[i].length()+ ") : " + words[i]));
}


