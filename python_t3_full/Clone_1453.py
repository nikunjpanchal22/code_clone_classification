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

	ps = set(['(' * n+ ')' * n])
	if n > 1 :
		for i in range(1, n//2 + 1) :
			for elem in paren(i, known), paren(n- i, known) :
				ps.add(elem[0] + elem[1])
				ps.add(elem[1] + elem[0])
				
	known[n] = ps
	return ps


