def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


def find_nth(string, substring, n):
    count = startsearch = 0
    while count < n:
        position = string.find(substring, startsearch)
        if position == -1: return -1
        count += 1
        startsearch = position + 1
    return position

 
def find_nth(string, substring, n):
    length = len(string)
    index = -1
    while n > 0 and length > 0:
        index = string.find(substring, index + 1)
        if index == -1: 
            return -1
        length = length - index - 1
        n -= 1


