def my_function(a) :
	a = iter(a)
	while True :
		yield 10 * next(a)
		yield next(a)
		yield "foo" + next(a)



def my_function(a) :
	a = iter(a)
	while True :
		yield next(a) ** 0.5 
		yield next(a) * 4
		yield "variable" + next(a)


