def div3() :
	divlist = []
	num = range(1, 10)
	for n in num :
		if n % 3 == 0 :
			for _ in xrange(20) :
				divlist.append(random.randint(0, 10))
	print divlist




import random
def div3():
    divlist = [random.randint(0, 10) for _ in range(20)] * sum([1 for n in range(1, 10) if n % 3 == 0])
    print(divlist)


