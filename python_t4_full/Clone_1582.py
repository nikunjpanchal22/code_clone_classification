def reverse(s) :
	t = - 1
	s2 = ''
	while abs(t) < len(s) + 1 :
		s2 = s2 + s [t]
		t = t - 1
	return s2


 def reverse(s): 
   lst = list(s) 
   rev_s = ''
   for i in lst[::-1] : 
      rev_s = rev_s + i  
   return rev_s


