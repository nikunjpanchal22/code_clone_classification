def checksum(msg) :
	s = 0
	for i in range(0, len(msg), 2) :
		w = ord(msg [i]) + (ord(msg [i + 1]) << 8)
		s = carry_around_add(s, w)
	return ~ s & 0xffff


 def checksum(msg):
   s = 0
   i = 0
   while i < len(msg):
      w = msg[i] * 2**8 + msg[i+1]
      w = ord(w)
      s = carry_around_add(s,w)
      i += 2
   return ~s & 0xffff


