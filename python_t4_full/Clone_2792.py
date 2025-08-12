def unique(l) :
	s = set(); n = 0
	for x in l :
		if x not in s : s.add(x); l [n] = x; n += 1
	del l [n :]


 def unique(l):
    unique_l = []
    for i in l:
        if i not in unique_l:
            unique_l.append(i)
    return unique_l


