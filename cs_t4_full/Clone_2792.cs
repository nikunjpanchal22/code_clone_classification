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
    switch (value) {
        case '&':
            _bufferState = _bufferState == 0 ? ++_bufferState : 0;
            break;
        case ';':
            if (_bufferState > 1) ++_bufferState;
            else {
                this.Write('&');
                this.Write(AmpToken);
                _bufferState = 0;
            }
            break;
        case '\n':
            base.Write ("&#10;");
            return;
        default:
            base.Write (value);
            break;
    }
}


