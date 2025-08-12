def all_pairs(lst) :
	if len(lst) < 2 :
		yield []
		return
	if len(lst) % 2 == 1 :
		for i in range(len(lst)) :
			for result in all_pairs(lst [: i] + lst [i + 1 :]) :
				yield result
	else :
		a = lst [0]
		for i in range(1, len(lst)) :
			pair = (a, lst [i])
			for rest in all_pairs(lst [1 : i] + lst [i + 1 :]) :
				yield [pair] + rest


 def all_pairs(lst) :
   if len(lst) < 2:
      return
   elif len(lst) % 2 != 0:
      for i in range(len(lst)):
         remainder = all_pairs(lst[:i] + lst[i + 1:])
         if not remainder:
            yield []
         for pair in remainder:
            yield pair
   else:
      a = lst[0]
      for i in range(1, len(lst)):
         tuple = (a, lst[i])
         result = all_pairs(lst[1:i] + lst[i+1:])
         if not result:
            pass
         for rest in result:
            yield [tuple] + rest


