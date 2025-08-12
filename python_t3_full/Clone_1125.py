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
      for index in range(len(lst)):
         replaced_list = lst[:index] + lst[index + 1:]
         output = all_pairs(replaced_list)
         if not output:
            pass
         for result in output:
            yield result
   else:
      first_item = lst[0]
      for index in range(1, len(lst)):
         pair = (first_item, lst[index])
         rest = all_pairs(lst[1:index] + lst[index + 1:])
         if not rest:
            pass
         for r in rest:
            yield [pair] + r


