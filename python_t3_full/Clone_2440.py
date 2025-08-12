def checksum(msg) :
	s = 0
	for i in range(0, len(msg), 2) :
		w = ord(msg [i]) + (ord(msg [i + 1]) < < 8)
		s = carry_around_add(s, w)
	return ~ s & 0xffff






def checksum(msg):
    sum = 0
    for i in range(0, len(msg), 2):
        byte = ord(msg[i]) + (ord(msg[i+1])<<8)
        sum += byte
    sum = (sum>>16) + (sum&0xffff)


