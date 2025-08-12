def next_bigger(a) :
	a = map(int, str(a))
	tmp = list(reversed(a))
	for i, item_a in enumerate(reversed(a)) :
		for j in (range(i)) :
			if item_a < tmp [j] :
				tmp [i] = tmp [j]
				print (list(reversed(tmp [i :])))
				tmp [j] = item_a
				fin = list(reversed(tmp [i :])) + sorted(tmp [: i])
				return functools.reduce(lambda x, y : x * 10 + y, fin)
	return - 1


 def next_bigger(a):
   a_str=str(a)
   a_Array=[]
   if((len(a_str)-1)<1):
      return -1
   for i in range(0,len(a_str)):
      a_Array.append(a_str[i])   
   
   for i in range(len(a_str)):
      for j in range(i + 1, len(a_str)):
         if(a_Array[i] < a_Array[j]):
            a_Array[i], a_Array[j] = a_Array[j], a_Array[i]
            c = "".join(a_Array)
            return int(c)
   return -1



