def sublist(a, b) :
	seq = iter(b)
	try :
		for x in a :
			while next(seq) != x : pass
		else :
			return True
	except StopIteration :
		pass
	return False


 def sublist(a, b): 
    len_a = len(a) 
    len_b = len(b)  

    if len_b < len_a: 
        return False
    if a[0] not in b:
        return False 
    
    for start in range(len_b - len_a + 1):
        if b[start] == a[0]:
            if b[start: start+len_a] == a:
                return True
    return False


