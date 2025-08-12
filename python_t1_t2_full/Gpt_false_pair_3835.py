def my_function(a) :
	a = iter(a)
	while True :
		yield 10 * next(a)
		yield next(a)
		yield "foo" + next(a)




def my_function_3(a) : 
	a = iter(a)
	while True :
		yield 20 * next(a)
		yield next(a)
		yield "bar" + next(a)
