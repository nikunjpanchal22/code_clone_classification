def checksum(msg) :
	s = 0
	for i in range(0, len(msg), 2) :
		w = ord(msg [i]) + (ord(msg [i + 1]) < < 8)
		s = carry_around_add(s, w)
	return ~ s & 0xffff


 

def checksum(msg):
    s = 0
    b = bytearray()
    b.extend(map(ord, msg))
    for i in range(0, len(b), 2):
        if i + 1 < len(b):
            val = b[i] + (b[i + 1] << 8)
        else:
            val = b[i]
        s = carry_around_add(s, val)
    return ~s & 0xffff


