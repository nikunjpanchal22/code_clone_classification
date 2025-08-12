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


 public override void WellKnownBinary(Stream sout) {
                sout.WriteByte(BitConverter.IsLittleEndian ? 0 : 1);
                sout.WriteByte(GeoBase.PolygonWkbs[0]);
                sout.WriteByte(GeoBase.PolygonWkbs[1]);
                sout.WriteByte(GeoBase.PolygonWkbs[2]);
                sout.WriteByte(GeoBase.PolygonWkbs[3]);
                sout.WriteByte(BitConverter.GetBytes(this.Rings.Count)[0]);
                sout.WriteByte(BitConverter.GetBytes(this.Rings.Count)[1]);
                sout.WriteByte(BitConverter.GetBytes(this.Rings.Count)[2]);
                sout.WriteByte(BitConverter.GetBytes(this.Rings.Count)[3]);
                
                foreach (var ring in this.Rings)
                {
                    sout.WriteByte(BitConverter.GetBytes(ring.Count)[0]);
                    sout.WriteByte(BitConverter.GetBytes(ring.Count)[1]);
                    sout.WriteByte(BitConverter.GetBytes(ring.Count)[2]);
                    sout.WriteByte(BitConverter.GetBytes(ring.Count)[3]);
                    foreach (var position in ring)
                    {
                        position.WellKnownBinary(sout);
                    }
                }
}


