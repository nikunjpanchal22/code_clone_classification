def unique(l) :
	s = set(); n = 0
	for x in l :
		if x not in s : s.add(x); l [n] = x; n += 1
	del l [n :]


 def unique(l) :
   temp_list = []
   for x in l:
      if x not in temp_list:
         temp_list.append(x)
   l = temp_list[:]


