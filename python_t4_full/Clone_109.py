def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(s, target, n):
    i = -1
    for _ in range(n):
        i = s.find(target, i + 1)
        if i < 0:
            break
    return i


