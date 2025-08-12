def my_function(a) :
	a = iter(a)
	while True :
		yield 10 * next(a)
		yield next(a)
		yield "foo" + next(a)




def my_function(a) :
	a = iter(a)
	while True :
		yield 5 * next(a)
		yield pow(next(a), 2)


