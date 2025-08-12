def div3() :
	divlist = []
	num = range(1, 10)
	for n in num :
		if n % 3 == 0 :
			for _ in xrange(20) :
				divlist.append(random.randint(0, 10))
	print(divlist)


  def div3() :
	divlist = [k for i in range(20) for j in range(1, 10) if j % 3 == 0 for k in [random.randint(0, 10)]]
	print(divlist)


