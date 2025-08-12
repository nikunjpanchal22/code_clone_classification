def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(string, substring, n):
    index = 0
    for i in range(n):
        index = string.find(substring, index+1) 
        if index == -1:
            break 
    return index


