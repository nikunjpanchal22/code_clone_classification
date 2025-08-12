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


 public override void WellKnownBinary(Stream sout)  
{  
            bool littleEndian= BitConverter.IsLittleEndian;
            sout.Write(BitConverter.GetBytes (littleEndian ? (byte) 1 : (byte) 0), 0 , 1);
            sout.Write (GeoBase.PolygonWkbs, 0, 4);
            int ringsCount = this.Rings.Count;
            int[]ringsCountValues = new int[] { ringsCount & 0xFF, (ringsCount >> 8) & 0xFF, (ringsCount >> 16 & 0xFF), (ringsCount >> 24 & 0xFF) };
            sout.Write(BitConverter.GetBytes(ringsCountValues), 0, 4);
            foreach(var ring in this.Rings) 
            {
                int ringCount = ring.Count;
                int[]ringCountValues = new int[] { ringCount & 0xFF, (ringCount >> 8) & 0xFF, (ringCount >> 16 & 0xFF), (ringCount >> 24 & 0xFF) };
                sout.Write(BitConverter.GetBytes(ringCountValues), 0, 4);
                foreach (var position in ring)
                {
                    position.WellKnownBinary(sout);
                }
            }
   
}


