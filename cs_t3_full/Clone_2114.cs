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


private void HandleAmp() { /*...*/ }
private void HandleSemiColon() { /*...*/ }
private void HandleLineBreak() { /*...*/ }


public override void Write (char value) {
    if (value == '&') {
        _bufferState ^= _bufferState; // toggles the state
        return;
    }
    else if (value == ';') {
        Write ('&');
        Write (AmpToken);
        return;
    }
    else if (value == '\n') {
        base.Write ("&#10;");
        return;
    }
    base.Write(value);
}


