public static void main (String [] args) {
    String [] colors = new String [args.length];
    int color_ix = 0;
    int number_idx = 0;
    Integer [] number = new Integer [args.length];
    for (int i = 0;
    i < args.length; i ++) {
        if (args [i] == null) {
            continue;
        }
        try {
            number [number_idx] = Integer.parseInt (args [i]);
            number_idx ++;
        } catch (NumberFormatException e) {
            colors [color_ix] = args [i];
            color_ix ++;
        }
    }
    System.out.println ("-----Number-----");
    for (int i = 0;
    i < number_idx; i ++) {
        System.out.println (number [i]);
    }
    System.out.println ("-----Colors-----");
    for (int i = 0;
    i < color_ix; i ++) {
        System.out.println (colors [i]);
    }
}



 public static void main (String [] args) {
   String [] colors = new String [args.length];
   ArrayList<Integer> numbers = new ArrayList<Integer>();
   for (int i = 0; i < args.length; i++) {
       if(args[i] == null)
           continue;
       try {
           numbers.add(Integer.parseInt(args[i]));
       } catch (NumberFormatException e) {
           colors[i] = args[i];
       }
   }
   System.out.println ("-----Number-----");
   for (int i = 0; i < numbers.size(); i++)
       System.out.println(numbers.get(i));

   System.out.println ("-----Colors-----");
   for (int i = 0; i < colors.length; i++)
       if(colors[i] != null)
           System.out.println(colors[i]);
}


