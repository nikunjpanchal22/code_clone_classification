def myMin(mylist) :
	smallest = float('inf')
	for l in mylist :
		if isinstance(l, list) :
			tmp = myMin(l)
			if tmp < smallest :
				smallest = tmp
		elif l < smallest :
			smallest = l
	if smallest == float('inf') :
		return None
	return smallest




def myMin_4(mylist):
   lowest = float('inf')
   for l in mylist:
      if isinstance(l, list):
         temp = myMin(l)
         if temp < lowest:
            lowest = temp
      elif l < lowest:
         lowest = l
   if lowest == float('inf'):
      return None
   return lowest
