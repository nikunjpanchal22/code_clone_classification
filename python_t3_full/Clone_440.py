def div3() :
	divlist = []
	num = range(1, 10)
	for n in num :
		if n % 3 == 0 :
			for _ in xrange(20) :
				divlist.append(random.randint(0, 10))
	print(divlist)


  def div3() :
	list1, list2 = [], []
	for i in range(1, 10) :
		if i % 3 == 0 :
			list1.append(i)
	for i in list1 :
		for x in range(20) :
			list2.append(random.randint(0, 10))
	print(list2)


