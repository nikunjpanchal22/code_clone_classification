def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(string, substring, n):
    start_pos = 0
    pos = 0
    while n > 0:
        pos = string.find(substring, start_pos)
        if pos == -1:
            return -1
        start_pos = pos+1
        n -= 1
    return pos


