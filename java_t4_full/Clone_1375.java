public static String join (String r [], String d) {
    if (r.length == 0) return "";
    StringBuilder sb = new StringBuilder ();
    int i;
    for (i = 0; i < r.length - 1; i ++) {
        sb.append (r [i]);
        sb.append (d);
    }
    sb.append (r [i]);
    return sb.toString ();
}


public static String join(String[] arr, String delim) {
    if(arr.length == 0) 
        return "";
    
    StringBuilder stringBuilder = new StringBuilder(arr[0]);
    for (int i = 1; i < arr.length; i++) {
        stringBuilder.append(delim);
        stringBuilder.append(arr[i]);
    }
    
    return stringBuilder.toString();
} 


