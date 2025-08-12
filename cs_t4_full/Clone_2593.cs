public bool IsCompletedBy (Keys key) {
    if (key == _code [_index]) {
        if (_index == _code.Length - 1) {
            _index = 0;
            return true;
        }
        ++ _index;
    } else {
        _index = 0;
    }
    return false;
}





public bool IsCompletedBy(Keys key) {
    bool result = key == _code[_index] ? (_index == _code.Length - 1 ? (++_index == _code.Length) : (++_index == _code.Length)) : (_index = 0) == 0;
    _index = result ? 0 : _index;
    return result;
}


