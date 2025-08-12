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
    int end = index + ret;
    for (int i = index; i < end; i ++) {
        if (! XmlConvert.IsXmlChar (buffer [i]))
            buffer [i] = ' ';
    }
    return ret;
}
