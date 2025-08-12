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
    String textVar = "TextSplit~Example~Using~Different~Patterns~To~Split~String";
    System.out.println ("textVar length: " + textVar.length ());
    String [] words = textVar.split ("~", 7);
    Arrays.asList(words).forEach(word -> System.out.println("Word (len: "+ word.length()+"): "+word)); 
}


