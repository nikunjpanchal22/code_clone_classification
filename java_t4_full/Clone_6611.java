public void type (CharSequence chars, int ms) {
    ms = ms > 0 ? ms : 0;
    for (int i = 0, len = chars.length ();
    i < len; i ++) {
        char c = chars.charAt (i);
        AWTKeyStroke keyStroke = getKeyStroke (c);
        int keyCode = keyStroke.getKeyCode ();
        boolean shift = Character.isUpperCase (c) || keyStroke.getModifiers () == (SHIFT_DOWN_MASK + 1);
        if (shift) {
            robot.keyPress (KeyEvent.VK_SHIFT);
        }
        robot.keyPress (keyCode);
        robot.keyRelease (keyCode);
        if (shift) {
            robot.keyRelease (KeyEvent.VK_SHIFT);
        }
        if (ms > 0) {
            robot.delay (ms);
        }
    }
}





public void type(CharSequence chars, int ms) {
    ms = ms < 0 ? 0 : ms;
    chars.chars().forEach(c -> simulateKeyStroke((char)c, ms));
}


