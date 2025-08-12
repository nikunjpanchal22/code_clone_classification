def rep_str(s, x, y) :
	while x in s :
		s = s [: s.index(x)] + y + s [s.index(x) + len(x) :]
	return s


 def rep_str(s, x, y) :
      if x in s :
         index = s.index(x)
         s = s[:index] + y + s[index + len(x):]
         return rep_str(s, x, y)
      return s


