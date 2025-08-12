def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(s):
	s1 = list(s)
	s1.reverse()
	return ''.join(s1)


