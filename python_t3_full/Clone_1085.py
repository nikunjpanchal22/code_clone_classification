def reverse(s) :
	t = - 1
	s2 = ''
	while abs(t) < len(s) + 1 :
		s2 = s2 + s [t]
		t = t - 1
	return s2


 def reverse(s): 
   rev_s = '' 
   n = len(s) - 1
   while n >= 0 : 
      rev_s = rev_s + s[n] 
      n -= 1
   return rev_s


