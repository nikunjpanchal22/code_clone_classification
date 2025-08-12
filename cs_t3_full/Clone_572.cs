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
    sout.WriteByte (BitConverter.IsLittleEndian ? (byte) 1 : (byte) 0);
    sout.Write (GeoBase.PolygonWkbs, 0, 4);
    //Using BinarySearch
    int[] tempArray = new int[this.Rings.Count];
    this.Rings.CopyTo(tempArray, 0);
    Array.Sort(tempArray);
    int index = Array.BinarySearch(tempArray, this.Rings.Count);
    sout.Write ( BitConverter.GetBytes ( index ), 0, 4);
    foreach (var ring in this.Rings) {
        foreach (var position in ring) {
            position.WellKnownBinary (sout);
        }
    }
}


