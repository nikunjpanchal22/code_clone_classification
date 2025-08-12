def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(text, pattern, n):
    result = 0
    for x in range(n):
        result = text.find(pattern, result+1)
        
    return result


