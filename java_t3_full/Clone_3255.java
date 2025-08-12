public static void type (String characters) {
    Clipboard clipboard = Toolkit.getDefaultToolkit ().getSystemClipboard ();
    StringSelection stringSelection = new StringSelection (characters);
    clipboard.setContents (stringSelection, clipboardOwner);
    robot.keyPress (KeyEvent.VK_CONTROL);
    robot.keyPress (KeyEvent.VK_V);
    robot.keyRelease (KeyEvent.VK_V);
    robot.keyRelease (KeyEvent.VK_CONTROL);
}




public static void pasteString (String stringToPaste) {
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    StringSelection strSel = new StringSelection(stringToPaste);
    clipboard.setContents(strSel, null);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_SHIFT);
    robot.keyPress(KeyEvent.VK_INSERT);
    robot.keyRelease(KeyEvent.VK_INSERT);
    robot.keyRelease(KeyEvent.VK_SHIFT);
    robot.keyRelease(KeyEvent.VK_CONTROL);
}


