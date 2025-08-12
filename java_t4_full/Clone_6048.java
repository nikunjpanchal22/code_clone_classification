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
    String str = "Implementing~Different~Ways~To~Split~And~Print~Words~From~A~String";
    System.out.println ("String Length: " + str.length ());
    String [] wordsArray = str.split ("~", 9);
    Arrays.stream(wordsArray).forEach(word -> System.out.println("Word (len: "+ word.length()+"): "+word)); 
}


