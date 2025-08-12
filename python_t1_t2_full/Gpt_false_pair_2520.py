def checksum(msg) :
	s = 0
	for i in range(0, len(msg), 2) :
		w = ord(msg [i]) + (ord(msg [i + 1]) < < 8)
		s = carry_around_add(s, w)
	return ~ s & 0xffff




def checksum(msg):
	s = 0
	for i in range(0, len(msg), 3):
		w = ord(msg [i]) + (ord(msg [i + 1]) < < 8) + (ord(msg[i + 2]) << 16)
		s = carry_around_add(s, w)
	return ~ s & 0xffffffff 

