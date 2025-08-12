def divisors(integer) :
	arr = []
	for x in range(2, integer - 1) :
		if integer % x == 0 :
			arr.append(x)


  def divisors(integer) : 
		arr = [] 
		for x in range(integer // 2, 1, -1) : 
			if integer % x == 0 : 
				arr.append(x) 
