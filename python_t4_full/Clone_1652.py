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
   if len(lst)<2:
     yield []
     return
   elif len(lst)%2!=0:
     for index in range(len(lst)):
       temp_list= lst[:index]  + lst[index+1:]
       result=all_pairs(temp_list)
       if not result:
           pass
       
       for elements in result :
          yield elements
   else:
      temp_list=lst[1:]
      first_element=lst[0]

      for index in range(len(temp_list)):
         pair=(first_element,temp_list[index])
         result=all_pairs(temp_list[:index] + temp_list[index+1:] )
         if not result:
            pass

         for elements in result:
            yield [pair] + elements


