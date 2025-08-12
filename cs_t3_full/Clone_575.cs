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
                byte[] littleEndian = {0x01};
                byte[] bigEndian = {0x00};
                sout.Write (BitConverter.IsLittleEndian ? littleEndian : bigEndian, 0, 1);
                sout.Write (GeoBase.PolygonWkbs, 0, 4);
                sout.Write (BitConverter.GetBytes (this.Rings.Count), 0, 4);
                foreach (var ring in this.Rings) {
                    sout.Write (BitConverter.GetBytes (ring.Count), 0, 4);
                    foreach (var position in ring) {
                        position.WellKnownBinary (sout);
                    }
                } 
}


