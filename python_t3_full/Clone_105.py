def find_nth(s, substr, n) :
	i = 0
	while n > = 0 :
		n -= 1
		i = s.find(substr, i + 1)
	return i


 def find_nth(s, substr, n):
	index = 0
	while n > 0:
		index = s.find(substr, index) +1
		n -= 1
	return index


