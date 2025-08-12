def rep_str(s, x, y) :
	while x in s :
		s = s [: s.index(x)] + y + s [s.index(x) + len(x) :]
	return s


  def rep_str(s, x, y) :
      i = 0
      while i < len(s) :
         if s[i:i+len(x)] == x :
            s = s[:i] + y + s[i+len(x):]
         i += 1
      return s


