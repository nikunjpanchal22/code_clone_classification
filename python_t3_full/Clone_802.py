def my_function(a) :
	a = iter(a)
	while True :
		yield 10 * next(a)
		yield next(a)
		yield "foo" + next(a)


def my_function(a):
    a = iter(a)
    while True:
        yield 10 * next(a)
        yield str(next(a))
        yield "foo" + str(next(a))


