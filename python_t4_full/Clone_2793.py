def unique(l) :
	s = set(); n = 0
	for x in l :
		if x not in s : s.add(x); l [n] = x; n += 1
	del l [n :]


 def unique(l): 
    n = len(l)
    for i in range(n):
        for j in range(i+1, n):
            if l[i] == l[j]:
                return l[:i] + l[i+1:j] + l[j+1:]


