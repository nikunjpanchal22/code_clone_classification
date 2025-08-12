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


 public override void WellKnownBinary(Stream sout){
            sout.Write(BitConverter.GetBytes(BitConverter.IsLittleEndian ? 1 : 0), 0, 1);
            sout.Write(GeoBase.PolygonWkbs, 0, 4);

            int ringCount = this.Rings.Count;
            byte[] ringCountBytes = {
                (byte) (ringCount & 0xff),
                (byte) (ringCount >> 8 & 0xFF),
                (byte) (ringCount >> 16 & 0xFF),
                (byte) (ringCount >> 24 & 0xFF)
            };
            sout.Write(ringCountBytes, 0, 4);

            foreach (var ring in this.Rings) {
                int ringLength = ring.Count;
                byte[] ringLengthBytes = {
                    (byte) (ringLength & 0xff),
                    (byte) (ringLength >> 8 & 0xFF),
                    (byte) (ringLength >> 16 & 0xFF),
                    (byte) (ringLength >> 24 & 0xFF)
                };
                sout.Write(ringLengthBytes, 0, 4);
                foreach (var position in ring) {
                    position.WellKnownBinary(sout);
                }
            }
}


