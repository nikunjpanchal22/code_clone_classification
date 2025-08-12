public override int Read (char [] buffer, int index, int count) {
    var ret = base.Read (buffer, index, count);
    for (int i = 0; i < ret; i ++) {
        int idx = index + i;
        if (! XmlConvert.IsXmlChar (buffer [idx]))
            buffer [idx] = ' ';
    }
    return ret;
}


 public override int Read (char [] buffer, int index, int count) {
   var ret = base.Read (buffer, index, count);
   for (int i = 0; i < ret; i ++) {
       int idx = index + i;
       if (! XmlConvert.IsXmlChar (buffer [idx]))
           buffer [idx] = '^';
   }
   return ret;
}
