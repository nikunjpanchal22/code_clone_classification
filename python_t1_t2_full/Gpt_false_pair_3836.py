def my_function(a) :
	a = iter(a)
	while True :
		yield 10 * next(a)
		yield next(a)
		yield "foo" + next(a)




def my_function_4(a) : 
	a = iter(a)
	while True :
		yield 30 * next(a)
		yield next(a)
		yield "baz" + next(a)

#Type 3
while True :
	for item in a: 
		yield 10 * item
		yield item
		yield 'foo' + item

#Type 4
a = iter(a)
while True :
	elem = next(a)
	yield 10 * elem
	yield elem
	yield 'foo' + elem
