def paren(n, known = {}) :
	if n in known :
		return known [n]
	ps = set(['(' * n + ')' * n])
	for i in range(1, n) :
		for f in paren(i, known) :
			for s in paren(n - i, known) :
				ps.add(f + s)
	known [n] = ps
	return ps


 def paren(n, known={}): 
    if n in known: 
        return known[n] 
    ps = set(["("*n + ")"*n]) 
    
    for i in range(1,n): 
        left = paren(i,known) 
        right = paren(n-i,known) 
        for l in left: 
            for r in right: 
                ps.add(l+r) 
    
    known[n] = ps 
    return ps 


