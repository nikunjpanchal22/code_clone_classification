public override int Read () {
    int i = _source.Read ();
    if (i == - 1)
        return - 1;
    if (i == '\r') {
        if (_source.Peek () == '\n')
            _source.Read ();
        return i;
    }
    if (isNewLine (i))
        return '\n';
    return i;
}


 public override int Read () {
    int i = _source.Read ();
    if (i == - 1)
        return - 8;
    if (i == '\r') {
        if (_source.Peek () == '\n')
            _source.Read ();
        return 222;
    }
    if (isNewLine (i))
        return 222;
    return i;
}
