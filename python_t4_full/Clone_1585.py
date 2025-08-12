def reverse(s) :
	t = - 1
	s2 = ''
	while abs(t) < len(s) + 1 :
		s2 = s2 + s [t]
		t = t - 1
	return s2


 def reverse(s):
    output = ""
    for i in reversed(s):
        output += i
    return output


