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


 public boolean equals(Object obj) {
    if (this == obj)
        return true;
        
    if (obj instanceof Connection) {
        Connection other = (Connection) obj;
        if ((this.dstAddr != null && other.dstAddr != null &&  this.dstAddr.equals(other.dstAddr))
            || (this.dstAddr == null && other.dstAddr == null)) 
        {
            if (this.dstPort == other.dstPort) {
                if (( this.protocol != null && other.protocol != null && this.protocol.equals(other.protocol))
                    || ( this.protocol == null && other.protocol == null)) 
                {
                    if (( this.srcAddr != null && other.srcAddr != null && this.srcAddr.equals(other.srcAddr))
                        || ( this.srcAddr == null && other.srcAddr == null)) 
                    {
                        if (this.srcPort == other.srcPort) {
                            return true;
                        }
                    }
                }
            }
        }
    }
    return false;
}


