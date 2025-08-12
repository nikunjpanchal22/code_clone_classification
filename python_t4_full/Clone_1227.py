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


 def next_bigger(a) :
   a = list(map(int, str(a)))
   l = len(a)
   for i in range(l-2, -1, -1) :
       if(a[i] < a[i+1]) :
           break
   
   if(i == -1) :
       return -1
   
   i1 = -1
   for j in range(i+1, l) :
       if(a[i] < a[j]) :
           i1 = j
   
   a[i], a[i1] = a[i1], a[i]
   s = a[i+1:]
   s.sort()
   n = a[:i+1] + s
   return int(''.join(str(x) for x in n))



