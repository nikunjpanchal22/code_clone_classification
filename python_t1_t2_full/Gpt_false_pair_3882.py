def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)




def find_nth_type4(string, substring, n): 
    if (n == 1): 
        return string.rfind(substring) 
    else: 
        return string.rfind(substring, 0, string.rfind(substring))
