def unique(l) :
	s = set(); n = 0
	for x in l :
		if x not in s : s.add(x); l [n] = x; n += 1
	del l [n :]


 def unique(l) :
   s = set(); i = 0; 
   for x in l: 
      if x not in s: s.add(x)
   l = [x for x in l if x in s]


