def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(s, t, n):
	i = s.find(t)
	while n>1:
		i = i + 1 + s[i+1:].find(t)
		n = n - 1
		if i == -1:
			break
	return i


