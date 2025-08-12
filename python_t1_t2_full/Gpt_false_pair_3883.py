def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)




def find_nth_type3(string, substring, n): 
    if (n == 1): 
        return string.find(substring) 
    else: 
        return string.find(substring, string.find(substring, 0) + 1) 
