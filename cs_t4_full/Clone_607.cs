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
            sout.WriteByte((BitConverter.IsLittleEndian) ? (byte)1 : (byte)0);
            sout.Write(GeoBase.PolygonWkbs, 0, 4);
            int ringCount = this.Rings.Count;
            int[] ringCountValues = new int[4] { ringCount >> 24, (ringCount & 0x00FF0000) >> 16, (ringCount & 0x0000FF00) >> 8, ringCount & 0x000000FF };
            sout.Write(BitConverter.GetBytes(ringCountValues), 0, 4);
            foreach (var ring in this.Rings) {
                    int ringCountInternal = ring.Count;
                    int[] ringCountInternalValues = new int[4] { ringCountInternal >> 24, (ringCountInternal & 0x00FF0000) >> 16, (ringCountInternal & 0x0000FF00) >> 8, ringCountInternal & 0x000000FF };
                    sout.Write (BitConverter.GetBytes (ringCountInternalValues), 0, 4);
                    foreach (var position in ring) {
                    position.WellKnownBinary (sout);
                    }
                }
}


