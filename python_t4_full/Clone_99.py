def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(string, substring, n):
    start_index = 0 
    pos = -1
    for i in range(n):
        position = string.find(substring, start_index)
        if position == -1:
            return pos
        start_index = position + 1
        pos = position
    return pos


