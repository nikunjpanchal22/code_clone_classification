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
    byte littleEndian = BitConverter.IsLittleEndian ? (byte) 0x01 : (byte) 0x00;
    sout.WriteByte (littleEndian);
    sout.Write (GeoBase.PolygonWkbs, 0, 4);
    sout.Write (BitConverter.GetBytes (this.Rings.Count), 0, 4);
    for (int i = 0; i < this.Rings.Count; i++) {
        var ring = this.Rings[i];
        sout.Write (BitConverter.GetBytes (ring.Count), 0, 4);
        for (int j = 0; j < ring.Count; j++) {
            var position = ring[j];
            position.WellKnownBinary (sout);
        }
    }
}


