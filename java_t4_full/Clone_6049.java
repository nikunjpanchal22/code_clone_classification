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
    String msg = "This~is~another~example~code~to~split~strings~and~print";
    System.out.println ("msg length: " + msg.length ());
    String [] partitions= msg.split ("~", 8);
    IntStream.range(0, partitions.length).forEach(i -> System.out.println("partitions[" + i + "]: (len: " + partitions[i].length()+ ") : " + partitions[i]));
}


