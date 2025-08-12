public static boolean areAnagrams (String one, String two) {
    if (one.length () == two.length ()) {
        String s0 = one.toLowerCase ();
        String s1 = two.toLowerCase ();
        HashMap < Character, Integer > chars = new HashMap < Character, Integer > (one.length ());
        Integer count;
        for (char c : s0.toCharArray ()) {
            count = chars.get (c);
            count = Integer.valueOf (count != null ? count + 1 : 1);
            chars.put (c, count);
        }
        for (char c : s1.toCharArray ()) {
            count = chars.get (c);
            if (count == null) {
                return false;
            } else {
                count --;
                chars.put (c, count);
            }
        }
        for (Integer i : chars.values ()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    } else {
        return false;
    }
}



 

public static boolean areAnagrams (String one, String two) {
    one = one.toLowerCase();
    two = two.toLowerCase();
    Map<Character, Integer> map = one.chars().boxed().collect(Collectors.groupingBy(i -> Character.valueOf((char)i.intValue()), Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
    map.forEach((k, v) -> map.put(k, -v));
    two.chars().mapToObj(i -> Character.valueOf((char)i.intValue())).forEach(k -> map.put(k, map.getOrDefault(k, 0) + 1));
    return !map.values().stream().anyMatch(i -> i != 0);
}


