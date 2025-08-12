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
         temp_lst = lst[:index] + lst[index+1:]
         output = all_pairs(temp_lst)
         if not output:
               pass
         for y in output:
               yield y
   else:
      first = lst[0]
      temp_lst = lst[1:]
      for i in range(len(temp_lst)):
         pair = (first, temp_lst[i])
         result = all_pairs(temp_lst[:i] + temp_lst[i+1:])
         if not result:
               pass
         for out in result:
               yield [pair] + out


