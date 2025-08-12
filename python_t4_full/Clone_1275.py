def rep_str(s, x, y) :
	while x in s :
		s = s [: s.index(x)] + y + s [s.index(x) + len(x) :]
	return s


 def rep_str(s, x, y) :
      result = ''
      i = 0
      start = 0
      while i < len(s) :
         index = s.find(x, start)
         if index != -1 :
            result += s[start:index] + y
            start = index + len(x)
         else :
            result += s[start:]
            break
      return result


