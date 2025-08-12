def find_nth(s, substr, n) :
	i = 0
	while n > = 0 :
		n -= 1
		i = s.find(substr, i + 1)
	return i


 def find_nth(s, substr, n):
	
	pos = 0
	while n > 0:
		index = s.index(substr, pos) + 1
		n -= 1
		pos = index
	return index


