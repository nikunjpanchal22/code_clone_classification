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


//Implementation #8
public override int Read() {
    int i = _source.Read();
    if (i == - 1) return -1;
    if (i != '\r') return isNewLine(i) ? '\n' : i;
    return _source.Peek() == '\n' ? _source.Read() : i;
}


