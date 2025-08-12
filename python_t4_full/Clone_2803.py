def unique(l) :
	s = set(); n = 0
	for x in l :
		if x not in s : s.add(x); l [n] = x; n += 1
	del l [n :]


 def unique(l) :
   seen = set()
   filtered_list = [x for x in l if not (x in seen or seen.add(x))]


