public override int ReadBlock (char [] buffer, int index, int count) {
    var ret = base.ReadBlock (buffer, index, count);
    for (int i = 0; i < ret; i ++) {
        int idx = index + i;
        if (! XmlConvert.IsXmlChar (buffer [idx]))
            buffer [idx] = ' ';
    }
    return ret;
}


 public override int ReadBlock (char [] buffer, int index, int count) {
    var ret = base.ReadBlock (buffer, index, count);
    var start = index; 
    while (start < index + ret) { 
        if (! XmlConvert.IsXmlChar (buffer[start])) {
            buffer [start] = ' ';
        } 
        start++; 
    } 
    return ret; 
}


