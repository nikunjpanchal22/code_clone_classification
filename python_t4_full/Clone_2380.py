def compare(a, b) :
	i_zip = list(enumerate(zip(a, b)))
	llen = len(a)
	hp = llen // 2
	c = 0 
	for i in i_zip :
		if (i[1][0] == i[1][1]):
			c+=1
	return c >= hp


 def compare(a, b):
    if len(a) != len(b):
        return False
    
    n = len(a)
    c = 0
    for i in range(n):
        if a[i] == b[i]:
            c += 1
    
    return c >= n//2


