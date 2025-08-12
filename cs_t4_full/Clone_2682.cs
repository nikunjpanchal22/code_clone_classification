public override void WellKnownBinary (Stream sout) {
    sout.WriteByte (BitConverter.IsLittleEndian ? (byte) 1 : (byte) 0);
    sout.Write (GeoBase.PolygonWkbs, 0, 4);
    sout.Write (BitConverter.GetBytes (this.Rings.Count), 0, 4);
    foreach (var ring in this.Rings) {
        sout.Write (BitConverter.GetBytes (ring.Count), 0, 4);
        foreach (var position in ring) {
            position.WellKnownBinary (sout);
        }
    }
}


 public override void WellKnownBinary (Stream sout) {
    var header = BitConverter.IsLittleEndian ? (byte) 1 : (byte) 0;
    sout.WriteByte (header);
    sout.Write (GeoBase.PolygonWkbs, 0, 4);
    var ringCount = BitConverter.GetBytes (this.Rings.Count);
    sout.Write (ringCount, 0, 4);
    this.Rings.ForEach(ring => {
        var ringSize = BitConverter.GetBytes (ring.Count);
        sout.Write (ringSize, 0, 4);
        foreach (var position in ring) {
            position.WellKnownBinary (sout);
        }
    });
}


