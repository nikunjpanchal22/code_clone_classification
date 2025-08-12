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
    if (ret > 0) {
        var end = Math.Min(index + count, index + ret);
        while (index < end) {
            if (! XmlConvert.IsXmlChar (buffer[index])) {
                buffer [index] = ' ';
            }
            index++;
        }
    }
    return ret;
}


