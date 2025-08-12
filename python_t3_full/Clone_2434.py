def checksum(msg) :
	s = 0
	for i in range(0, len(msg), 2) :
		w = ord(msg [i]) + (ord(msg [i + 1]) < < 8)
		s = carry_around_add(s, w)
	return ~ s & 0xffff


def checksum(msg):
    s = 0
    pairs = [msg[i:i+2] for i in range(0, len(msg), 2)]
    for pair in pairs:
        w = sum(ord(char) << 8 * j for j, char in enumerate(pair))
        s = carry_around_add(s, w)
    return ~ s & 0xffff

 


