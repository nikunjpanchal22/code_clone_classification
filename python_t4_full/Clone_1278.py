def rep_str(s, x, y) :
	while x in s :
		s = s [: s.index(x)] + y + s [s.index(x) + len(x) :]
	return s


 def rep_str(s, x, y) :
      i = 0
      s_list = list(s)
      while i < len(s_list) :
         if s_list[i:i+len(x)] == list(x):
            s_list = s_list[:i] + list(y) + s_list[i+len(x):]
         i += 1
      return ''.join(s_list)


