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


 private void printTree (OutputStreamWriter out, boolean isRight, String indent) throws IOException {
    out.write("\n" + indent);
   if(isRight) {
       out.write("/");
   } else {
       out.write("\\");
    }
    out.write("-----");
   if(right != null) {
       right.printTree(out, true, indent + (isRight ? "   &   " : "        "));
    }
   this.printNodeValue(out);
   if(left != null) {
       left.printTree(out, false, indent + (isRight ? " &   " : "        "));
    }
}


