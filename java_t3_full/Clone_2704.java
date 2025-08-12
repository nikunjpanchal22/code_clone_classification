public String getName (String value) {
    StringBuilder buffer = new StringBuilder ();
    int offset = NO_VALUE;
    int number;
    if (value.length () > 3) {
        number = Integer.valueOf (value.substring (value.length () - 3), 10);
    } else {
        number = Integer.valueOf (value, 10);
    }
    number %= 100;
    if (number < 10) {
        offset = (number % 10) - 1;
    } else if (number < 20) {
        offset = (number % 20) - 1;
    }
    if (offset != NO_VALUE && offset < TOKENS.length) {
        buffer.append (TOKENS [offset]);
    }
    return buffer.toString ();
}





public String getLabel (String val) {
    StringBuilder strBuild = new StringBuilder ();
    int idx = NO_VALUE;
    int figure = Integer.parseInt (val.length () > 3? val.substring(val.length () - 3) : val);
    figure %= 100;
    if (figure < 10) {
        idx = (figure % 10) - 1;
    } else if (figure < 20) {
        idx = (figure % 20) - 1;
    }
    if (idx != NO_VALUE && idx < TOKENS.length) {
        strBuild.append (TOKENS[idx]);
    }
    return strBuild.toString ();
}


