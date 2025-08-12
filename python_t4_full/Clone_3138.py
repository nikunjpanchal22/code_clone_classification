def find_nth(s, substr, n) :
	i = 0
	while n > = 0 :
		n -= 1
		i = s.find(substr, i + 1)
	return i


        offset = s.find(substr, offset) + 1
        if offset == 0: 
            # Substring is not found
            return -1  
    return offset - 1


 
 
def find_nth(s, substr, n): 
    if (n == 0): return -1
    start = end = 0


