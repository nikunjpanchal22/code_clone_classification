def unique(l) :
	s = set(); n = 0
	for x in l :
		if x not in s : s.add(x); l [n] = x; n += 1
	del l [n :]


 def unique(l) :
   new_list = []
   s = set()
   for x in l:
      if x not in s:
         s.add(x)
         new_list.append(x)
   l = new_list[:]


