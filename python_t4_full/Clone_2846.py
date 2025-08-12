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
      w = ord(msg[i]) << 8
      w = w + ord(msg[i+1])
      s = carry_around_add(s,w)
      i = i + 2
   return ~s & 0xffff


