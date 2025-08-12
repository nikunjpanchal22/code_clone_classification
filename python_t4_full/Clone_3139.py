def find_nth(s, substr, n) :
	i = 0
	while n > = 0 :
		n -= 1
		i = s.find(substr, i + 1)
	return i



def find_nth(s, substr, n): 
    from functools import reduce
    return reduce(lambda x, _: s.find(substr, x + 1), range(n), -1)


 

def find_nth(s, substr, n): 
    offset = 0


