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


 def paren(n, known = {}) :
	if n in known :
		return known[n]
	ps = set(['(' * n + ')' * n])
	for i in range(1, n):
		for f in paren(i, known) :
			for s in paren(n - i, known) :
				ps.add(f + s)
				ps.add(s + f)
	known [n] = ps
	return ps
