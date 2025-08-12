def find_nth(s, substr, n) :
	i = 0
	while n > = 0 :
		n -= 1
		i = s.find(substr, i + 1)
	return i


 def find_nth(s, substr, n):
	
	start = 0
	for _ in range(n):
		start = s.find(substr, start +1)
	if start == -1:
		return None
	return start


