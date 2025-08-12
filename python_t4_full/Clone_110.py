def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(s, target, n):
    while n > 0:
        pos = s.find(target)
        s = s[pos+1:]
        n -= 1
    return pos


