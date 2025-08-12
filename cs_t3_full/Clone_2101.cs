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


//Implementation #2
public override int Read() {
    int i = _source.Read();
    if (i == - 1)
        return - 1;
    if (_source.Peek() == '\n')
        _source.Read();
    return i == '\r' ? i : (isNewLine(i) ? '\n' : i);
}


