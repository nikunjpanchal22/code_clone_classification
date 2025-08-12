def rep_str(s, x, y) :
	while x in s :
		s = s [: s.index(x)] + y + s [s.index(x) + len(x) :]
	return s


 def rep_str(s, x, y) :
      i = 0
      length = len(x)
      while i < len(s) :
         if s[i: i+length] == x :
            return rep_str(s[:i] + y + s[i+length:], x, y)
         i += 1
      return s


