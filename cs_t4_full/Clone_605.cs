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


 public override void WellKnownBinary (Stream sout){
            if (BitConverter.IsLittleEndian) {
                sout.WriteByte(0x01);
            } else {
                sout.WriteByte(0x00);
            }
            sout.Write(GeoBase.PolygonWkbs, 0, 4);
            byte[] ringCountInBytes = BitConverter.GetBytes(this.Rings.Count);
            sout.Write(ringCountInBytes, 0, 4);
            int ringLength;
            foreach(var ring in this.Rings) {
                ringLength = ring.Count;
                byte[] ringLengthInBytes = BitConverter.GetBytes(ringLength);
                sout.Write(ringLengthInBytes, 0, 4);
                foreach (var position in ring) {
                    position.WellKnownBinary(sout);
                }
            }
}


