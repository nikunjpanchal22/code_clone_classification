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
        yield int(next(a))
        yield "foo" + int(next(a))


