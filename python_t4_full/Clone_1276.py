def rep_str(s, x, y) :
	while x in s :
		s = s [: s.index(x)] + y + s [s.index(x) + len(x) :]
	return s


 def rep_str(s, x, y) :
      res = []
      s += ' '
      j = 0
      for i in range(len(s)) :
         if s[i:i+len(x)] == x :
            res.append(y)
            j = i+len(x)-1
         else :
            res.append(s[j])
            j += 1
      return ''.join(res)


