def unique(l) :
	s = set(); n = 0
	for x in l :
		if x not in s : s.add(x); l [n] = x; n += 1
	del l [n :]




def unique(list):
    checked = []
    for e in list:
        if e not in checked:
            checked.append(e)
    return checked



