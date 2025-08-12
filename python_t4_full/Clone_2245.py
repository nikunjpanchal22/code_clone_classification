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


 def paren(n, known = {}): 
	if (n in known): 
		return known[n]
	ps = set([])
 
	for i in range(1<<n): 
		s = ""
		for j in range(n): 
			if (i & (1 << n-1-j)): 
				s = "(" + s
			else: 
				if (s[0] == "("): 
					s = ")" + s		
		ps.add(s) 
	known[n] = ps
	return ps


