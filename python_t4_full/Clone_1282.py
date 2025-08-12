def rep_str(s, x, y) :
	while x in s :
		s = s [: s.index(x)] + y + s [s.index(x) + len(x) :]
	return s


 def rep_str(s, x, y) :
      res = [s[i:i+len(x)] for i in range(len(s))]
      for i in range(len(res)):
         if res[i] == x:
            res[i] = y
      return ''.join(res)


