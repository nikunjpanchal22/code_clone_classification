def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 
def find_nth(string, substring, n):
    start = 0
    while n > 0:
        start = string.find(substring, start) + 1
        n -= 1


