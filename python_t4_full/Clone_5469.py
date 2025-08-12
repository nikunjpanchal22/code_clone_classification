def summary(xs) :
	for item in xs :
		try :
			yield sum(i ** 2 for i in item)
		except ValueError :
			yield 0




def summary(xs):
    for item in xs:
        if isinstance(item, (list, tuple)):
            yield sum(i**2 for i in item)


