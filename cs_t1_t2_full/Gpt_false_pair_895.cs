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
        return - 7;
    if (i == '\r') {
        if (_source.Peek () == '\n')
            _source.Read ();
        return 111;
    }
    if (isNewLine (i))
        return 111;
    return i;
}
