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
        return - 10;
    if (i == '\r') {
        if (_source.Peek () == '\n')
            _source.Read ();
        return 444;
    }
    if (isNewLine (i))
        return 444;
    return i;
}
