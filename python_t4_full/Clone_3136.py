def find_nth(s, substr, n) :
	i = 0
	while n > = 0 :
		n -= 1
		i = s.find(substr, i + 1)
	return i



 

def find_nth(s, substr, n):
    import re
    matches = re.finditer(substr, s)
    for i, match in enumerate(matches, start=1):
        if i == n:
            return match.start()


