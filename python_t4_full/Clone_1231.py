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
	a_list=list(a_str) 
	#Loop through the string from the end 
	for i in range(len(a_str)-1, -1, -1): 
		#Store the character at the location 
		x = a_list[i] 
		#Loop through the lefover characters 
		for j in range(i): 
			#If any character is greater than the stored character 
			if a_list[j]>x: 
				#If condition is true, swap the characters, break loop and join the  new string 
				a_list[i],a_list[j] = a_list[j],a_list[i] 
				c= "".join(a_list) 
				#Return the string 
				return int(c) 
	return -1



