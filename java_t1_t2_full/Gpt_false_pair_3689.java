private void printTree (OutputStreamWriter out, boolean isRight, String indent) throws IOException {
    if (right != null) {
        right.printTree (out, true, indent + (isRight ? "        " : " |      "));
    }
    out.write (indent);
    if (isRight) {
        out.write (" /");
    } else {
        out.write (" \\");
    }
    out.write ("----- ");
    printNodeValue (out);
    if (left != null) {
        left.printTree (out, false, indent + (isRight ? " |      " : "        "));
    }
}


private void printTree (OutputStreamWriter out, boolean isLeft, String indent) throws IOException {
    if (left != null) {
        left.printTree (out, true, indent + (isLeft ? "        " : " |      "));
    }
    out.write (indent);
    if (isLeft) {
        out.write (" \\");
    } else {
        out.write (" /");
    }
    out.write ("----- ");
    printNodeValue (out);
    if (right != null) {
        right.printTree (out, false, indent + (isLeft ? " |      " : "        "));
    }
}
