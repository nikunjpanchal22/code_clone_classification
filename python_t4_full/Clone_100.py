def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(string, substring, n):
    count = 0
    while n > 0:
        index = string.find(substring, count)
        if index == -1:
            return -1
        else: 
            count = index + 1
            n -= 1


