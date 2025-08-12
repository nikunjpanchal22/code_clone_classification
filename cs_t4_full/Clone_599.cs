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
    byte byteVal = BitConverter.IsLittleEndian ? (byte) 1 : (byte) 0;
    sout.WriteByte(byteVal);
    sout.Write (GeoBase.PolygonWkbs, 0, 4);
    sout.Write (BitConverter.GetBytes (this.Rings.Count), 0, 4);


    foreach (var ring in this.Rings) {
        sout.Write (BitConverter.GetBytes (ring.Count), 0, 4);
        foreach (var position in ring) {
            var bytes = BitConverter.GetBytes(position.X);
            bytes[0] &= 252;
            sout.Write(bytes,0,8);

            bytes = BitConverter.GetBytes(position.Y);
            bytes[0] &= 252;
            sout.Write(bytes,0,8);
        }
    }
}


