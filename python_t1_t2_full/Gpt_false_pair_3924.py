def checksum(msg) :
	s = 0
	for i in range(0, len(msg), 2) :
		w = ord(msg [i]) + (ord(msg [i + 1]) < < 8)
		s = carry_around_add(s, w)
	return ~ s & 0xffff




def checksum(msg):
    s = 0
    for i in range(0, len(msg), 2):
        w = pow(2, 8)*ord(msg[i]) + ord(msg[i + 1])
        s = carry_around_add(s, w)
    return ~ s & 0xffff
