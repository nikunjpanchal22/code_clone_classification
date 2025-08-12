def find_nth(s, substr, n) :
	i = 0
	while n > = 0 :
		n -= 1
		i = s.find(substr, i + 1)
	return i


    return len(s) - len(split_s[-1]) - len(substr)


 

def find_nth(s, substr, n):
    counter = 0
    for i in range(len(s)):
        if s[i:i+len(substr)] == substr:
            counter += 1


