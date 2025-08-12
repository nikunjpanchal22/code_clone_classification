public static void main (String [] args) {
    System.out.println ("Hello World");
    String xyz = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final int mid = (xyz.length () + 1) / 2;
    String [] spstr = {xyz.substring (0, mid), xyz.substring (mid)};
    String firstMix = spstr [1] + spstr [0];
    String [] array = firstMix.split ("");
    for (int i = 1;
    i < 3; i ++) {
        String temp = array [i];
        array [i] = array [array.length - i];
        array [array.length - i] = temp;
    }
    String str1 = Arrays.toString (array);
    str1 = str1.substring (1, str1.length () - 1).replaceAll (",", "");
    int j = 2;
    for (int i = ((array.length / 2) - 2);
    i < (array.length) / 2; i ++) {
        String temp = array [i];
        array [i] = array [array.length / 2 + j];
        array [array.length / 2 + j] = temp;
        j --;
    }
    String str2 = Arrays.toString (array);
    str2 = str2.substring (1, str2.length () - 1).replaceAll (",", "");
    System.out.println (firstMix);
    System.out.println (str1);
    System.out.println (str2);
}


 public static void main(String [] args) { 
    System.out.println("Hello World!"); 
    String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int mid = (all.length() + 1)/2; 
    String[] splitStr = {all.substring(0,mid), all.substring(mid)}; 
    String firstMix = splitStr[1] + splitStr[0]; 
    String[] arr = firstMix.split(""); 
    for (int i = 1; i < 3; i++) {
        String temp = arr[i];
        arr[i] = arr[arr.length - i]; 
        arr[arr.length - i] = temp; 
    }
    String str1 = Arrays.toString(arr); 
    str1 = str1.substring(1,str1.length() - 1).replaceAll(",",""); 
    int j = 2; 
    for (int i = ((arr.length/2)-2); i < (arr.length/2); i++) {
        String temp = arr[i]; 
        arr[i] = arr[(arr.length/2 + j)];
        arr[(arr.length/2 + j)] = temp; 
        j--; 
    }
    String str2 = Arrays.toString(arr);
    str2 = str2.substring(1, str2.length()-1).replaceAll(",",""); 
    System.out.println(firstMix); 
    System.out.println(str1); 
    System.out.println(str2); 
}
