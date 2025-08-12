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
    var isEqual = key == _code[_index];
    
    if(!isEqual) _index = 0;
    else if(++_index == _code.Length) 
    {
        _index = 0;
        isEqual = true;
    }
    
    return isEqual;
}


