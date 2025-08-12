public static void main (String [] args) throws IOException {
    String ch;
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.print ("Enter the Statement:");
    ch = br.readLine ();
    int count = 0, len = 0;
    do {
        try {
            char name [] = ch.toCharArray ();
            len = name.length;
            count = 0;
            for (int j = 0;
            j < len; j ++) {
                if ((name [0] == name [j]) && ((name [0] >= 65 && name [0] <= 91) || (name [0] >= 97 && name [0] <= 123))) count ++;
            }
            if (count != 0) System.out.println (name [0] + " " + count + " Times");
            ch = ch.replace ("" + name [0], "");
        } catch (Exception ex) {
        }
    } while (len != 1);
}





    public static void main(String[] args) throws IOException {
        String ch;
        ch = new Scanner(System.in).nextLine();
        TreeMap<Character,Integer> map=new TreeMap<>();
        for(char c : ch.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        map.forEach((c, count) -> System.out.println(c + " " + count + " Times"));
}


