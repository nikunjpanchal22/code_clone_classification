def reverse(s) :
	t = - 1
	s2 = ''
	while abs(t) < len(s) + 1 :
		s2 = s2 + s [t]
		t = t - 1
	return s2


 def reverse(s): 
   string_len = len(s)
   reversed_string = ""
   while string_len > 0:
      reversed_string = reversed_string + s[string_len -1]
      string_len = string_len - 1
   return reversed_string


