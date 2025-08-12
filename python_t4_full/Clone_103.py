def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(string, substring, n): 
    start_pos = 0
    ix = 0
    while ix != n:
        start_pos = string.find(substring, start_pos)+1 
        ix += 1


