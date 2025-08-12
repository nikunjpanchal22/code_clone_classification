def Problem4() :
	y = 100
	a = []
	x1 = []
	y1 = []
	while y < 1000 :
		y = y + 1
		x = 100
		while x < 1000 :
			z = x * y
			if str(z) == str(z) [: : - 1] :
				a.append(z)
			x = x + 1
	a.sort()
	print (a)




def Problem4() :
    a = [x * y for y in range(100, 1000)  for x in range(100, 1000) if str(x * y) == str(x * y) [::-1]]
    a.sort()
    print(a)


