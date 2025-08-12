def find_nth(s, substr, n) :
	i = 0
	while n > = 0 :
		n -= 1
		i = s.find(substr, i + 1)
	return i


 

def find_nth(s, substr, n):
    from itertools import cycle
    cyc = cycle(s)
    i = 0
    for char in cyc:
        if char == substr:
            i += 1
        if i == n:
            break
    else:
        return -1


