def sublist(a, b) :
	i = - 1
	try :
		for e in a :
			i = b.index(e, i + 1)
	except ValueError :
		return False
	else :
		return True


 def sublist(a, b):
    j = 0
    for i in range(len(b)): 
        if b[i] == a[j] :
            j = j + 1  
        if j == len(a): 
            return True
    return False


