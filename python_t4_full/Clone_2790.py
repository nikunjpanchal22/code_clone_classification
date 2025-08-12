def unique(l) :
	s = set(); n = 0
	for x in l :
		if x not in s : s.add(x); l [n] = x; n += 1
	del l [n :]


 def unique(l):
    seen = {}
    result = []
    for item in l:
        if item not in seen:
            seen[item] = 1
            result.append(item)


