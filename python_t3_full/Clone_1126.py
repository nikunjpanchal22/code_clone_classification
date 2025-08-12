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
      yield []
      return
   elif len(lst) % 2 != 0:
      for i in range(len(lst)):
         rest = all_pairs(lst[:i] + lst[i + 1:])
         if not rest:
            yield []
         for result in rest:
            yield result
   else:
      first = lst[0]
      for i in range(1, len(lst)):
         pair = (first, lst[i])
         remaining = all_pairs(lst[1:i] + lst[i + 1:])
         if not remaining:
            yield []
         for rest in remaining:
            yield [pair] + rest


