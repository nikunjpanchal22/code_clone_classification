def sublist(a, b) :
	i = - 1
	try :
		for e in a :
			i = b.index(e, i + 1)
	except ValueError :
		return False
	else :
		return True


 def sublist(a,b): 
    for i in range(len(a)): 
        if a[i] not in b: 
            return False 
    return True 


