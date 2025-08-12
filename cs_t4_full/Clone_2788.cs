public override void Write (char value) {
    if (value == '&') {
        if (_bufferState == 0) {
            _bufferState ++;
            return;
        } else {
            _bufferState = 0;
        }
    } else if (value == ';') {
        if (_bufferState > 1) {
            _bufferState ++;
            return;
        } else {
            Write ('&');
            Write (AmpToken);
            _bufferState = 0;
        }
    } else if (value == '\n') {
        base.Write ("&#10;");
        return;
    }
    base.Write (value);
}




public override void Write (char value) {
    _bufferState = (value == '&') ? ((_bufferState == 0) ? (_bufferState + 1) : 0) : _bufferState;
    
    if(value == '&' && _bufferState > 0)
     return;

    _bufferState = (value == ';') ? ((_bufferState > 1) ? (_bufferState + 1) : 0) : _bufferState;
    
    if(value == ';'){
        Write('&');
        Write(AmpToken);
    }
    
    if(value == '\n')
     base.Write("&#10;");
    else
     base.Write(value);
}


