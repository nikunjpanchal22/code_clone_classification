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


 

public boolean equals(Object obj) 
{
    if (obj instanceof Connection) 
    {
        Connection other = (Connection) obj;
        return dstAddr.equals(other.dstAddr) && dstPort == other.dstPort && 
        protocol.equals(other.protocol)  && srcAddr.equals(other.srcAddr) && srcPort == other.srcPort;
    }
    return false;
}


