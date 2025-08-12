def pairsum_n(list1, value) :
	set1 = set(list1)
	if list1.count(value / 2) < 2 :
		set1.remove(value / 2)
	return set((min(x, value - x), max(x, value - x)) for x in filterfalse(lambda x : (value - x) not in set1, set1))


 def pairsum_n(list1, value):
   sums_list = []
   set1 = set(list1)
   if list1.count(value / 2) < 2:
      set1.remove(value / 2)
   for x in set1:
      if (value - x) in set1:
         sums_list.append(tuple((min(x, value - x), max(x, value - x))))
   return set(sums_list)


