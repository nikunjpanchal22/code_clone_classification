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
	ps = [] 
	ps.append('()'*n)

	sec_half = paren(n-1, known)
	for p in sec_half:
		ps.append('(' + p + ')')
	
	for i in range(n-1):
		for part1 in paren(i, known):
			for part2 in paren(n-i-1, known):
				ps.append(part1 + part2)
	known[n] = ps
	return ps 


