def unique(l) :
	s = set(); n = 0
	for x in l :
		if x not in s : s.add(x); l [n] = x; n += 1
	del l [n :]


 

def unique(lst):
   s = set()
   ret = []
   for item in lst:
      if item not in s:
         s.add(item)
         ret.append(item)
   return ret


