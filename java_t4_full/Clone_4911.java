public boolean equals (Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass () != obj.getClass ()) return false;
    Connection other = (Connection) obj;
    if (dstAddr == null) {
        if (other.dstAddr != null) return false;
    } else if (! dstAddr.equals (other.dstAddr)) return false;
    if (dstPort != other.dstPort) return false;
    if (protocol == null) {
        if (other.protocol != null) return false;
    } else if (! protocol.equals (other.protocol)) return false;
    if (srcAddr == null) {
        if (other.srcAddr != null) return false;
    } else if (! srcAddr.equals (other.srcAddr)) return false;
    if (srcPort != other.srcPort) return false;
    return true;
}




@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    
    if (obj instanceof Connection) {
        Connection other = (Connection) obj;
        
        return Objects.equals(dstAddr, other.dstAddr) && Objects.equals(dstPort, other.dstPort)
                && Objects.equals(protocol, other.protocol) && Objects.equals(srcAddr, other.srcAddr)
                && Objects.equals(srcPort, other.srcPort);
    }
    return false;
}


