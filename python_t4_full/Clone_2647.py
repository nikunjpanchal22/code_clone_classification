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
    n_b = len(b)  
    n_a = len(a)  
    if n_a > n_b: 
        return False
    
    i, j = 0, 0
    while i < n_b and j < n_a: 
        if b[i] == a[j]: 
            j += 1
        i += 1
    return j == n_a 


