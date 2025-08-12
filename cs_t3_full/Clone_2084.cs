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





public bool IsCompletedBy(Keys key) 
{
    if (key == _code [_index] && (++_index == _code.Length)) {
        _index = 0;
        return true;
    }
    _index = 0;
    return false;
}


