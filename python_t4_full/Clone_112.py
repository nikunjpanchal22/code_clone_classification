def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(string, substring, n):
    matched = string.split(substring)
    if n-1 > len(matched)-1:
        return -1
    return (sum(len(i) for i in matched[:n-1]) + len(substring)*(n-1))


