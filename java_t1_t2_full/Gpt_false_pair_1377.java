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


 public static void main (String [] args){
    System.out.println ("Hello World!");
    String allChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int mid = (allChars.length () + 1) / 2;
    String[] splitStrings = {allChars.substring (0, mid), allChars.substring (mid)};
    String firstMix = splitStrings[1] + splitStrings[0]; 
    String[] arr = firstMix.split("");
    for (int i=1; i<3; i++) {
        String temp=arr[i]; 
        arr[i]=arr[arr.length-i]; 
        arr[arr.length-i]=temp; 
    }
    String one = Arrays.toString(arr);
    one = one.substring(1,one.length()-1).replaceAll(",",""); 
    int x=2;  
    for(int i=(arr.length/2 -2); i<arr.length/2; i++) {
        String temp = arr[i]; 
        arr[i]=arr[arr.length/2+x];
        arr[arr.length/2+x]=temp;
        x--; 
    } 
    String two = Arrays.toString(arr);
    two = two.substring(1,two.length()-1).replaceAll(",","");
    System.out.println(firstMix); 
    System.out.println(one); 
    System.out.println(two); 
}
