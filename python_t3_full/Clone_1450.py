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
	for l in range(n, 0, -1):
		for r in range(n, 0, -1):
			if l + r - n == 0:
				for f in paren(l, known):
					for s in paren(r, known):
						ps.add(f + s)
	known[n] = ps
	return ps


