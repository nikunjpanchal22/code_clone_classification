def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(string, substring, n):
    location = string.find(substring) 
    for i in range(n-1):
        location = string.find(substring, (location+1))


