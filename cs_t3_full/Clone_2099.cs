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


//Implementation #7
public override int Read() {
    int i = _source.Read();
    if (i == - 1) return -1;
    if ((i == '\r' && _source.Peek() == '\n') || isNewLine(i)) {
        _source.Read();
        return '\n';
    }
    return i;
}


