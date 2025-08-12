public override void Write (string value) {
    if (_bufferState > 0) {
        if (value == AmpToken) {
            _bufferState ++;
            return;
        } else {
            Write ('&');
            _bufferState = 0;
        }
    }
    base.Write (value);
}


 public override void Write (string value) {
    if (_bufferState > 0) {
        if (StringComparer.Ordinal.Equals (value, AmpToken)) {
            _bufferState ++;
            return;
        } else {
            base.Write ('&');
            _bufferState = 0;
        }
    }
    base.Write (value);
}
