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
    var handlers = new Dictionary<char, Action> {
        ['&'] = () => _bufferState = _bufferState == 0 ? 1 : 0,
        [';'] = () => {
            if (_bufferState > 1) _bufferState++;
            else {
                Write ('&');
                Write (AmpToken);
                _bufferState = 0;
            }
        },
        ['\n'] = () => base.Write("&#10;")
    };

    if(handlers.TryGetValue(value, out var handler)){
        handler();
    } else {
        base.Write (value);
    }
}


