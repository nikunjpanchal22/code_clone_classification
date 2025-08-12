def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(string, substring, n):
    matches = [m.start() for m in re.finditer(substring, string)]

    if n-1 > len(matches)-1:
        return -1

    return matches[n-1]


