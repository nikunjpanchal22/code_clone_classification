def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(string, substring, n):
    pos = 0 
    for i in range(n):
        pos = string.find(substring, pos)+1 
        if pos == -1: 
            return -1 
    return pos 


