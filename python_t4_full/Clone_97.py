def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(string, substring, n):
    current_position = 0 
    found_position = -1
    while n > 0:
        found_position = string.find(substring, current_position)
        if found_position == -1: 
            return -1 
        else: 
            current_position = found_position + 1 
            n -= 1
    return found_position


