public override void WellKnownBinary (Stream sout) {
    byte order = BitConverter.IsLittleEndian ? (byte) 1 : (byte) 0;
    sout.WriteByte (order);
    sout.Write (GeoBase.MultiLineStringWkbs, 0, 4);
    sout.Write (BitConverter.GetBytes (this.LineStrings.Count), 0, 4);
    foreach (var lineString in this.LineStrings) {
        sout.WriteByte (order);
        sout.Write (GeoBase.LineStringWkbs, 0, 4);
        sout.Write (BitConverter.GetBytes (lineString.Count), 0, 4);
        foreach (var position in lineString) {
            position.WellKnownBinary (sout);
        }
    }
}


public override void WellKnownBinary (Stream sout) {
    byte order = BitConverter.IsLittleEndian ? (byte) 1 : (byte) 0;
    sout.WriteByte (order);
    sout.Write (GeoBase.MultiLineStringWkbs, 0, 4);
    sout.Write (BitConverter.GetBytes (this.LineStrings.Count), 0, 4);
    foreach (var lineString in this.LineStrings) {
        sout.WriteByte (order);
        sout.Write (GeoBase.LineStringWkbs, 0, 4);
        sout.Write (BitConverter.GetBytes (lineString.Length), 0, 4);
        for (int i = 0; i < lineString.Length; i++) {
            lineString[i].WellKnownBinary (sout);
        }
    }
}
