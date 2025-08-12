def foo(bar = None, i = 10) :
	if bar is None :
		bar = set()
	if i == 0 :
		return bar
	bar |= set(random.randint(1, 1000) for i in xrange(10))
	return foo(bar, i - 1)





import random
def foo(bar=None, i=10):
    bar = set() if bar is None else bar
    if i == 0 :
        return bar
    else:
        bar.update(set(random.randint(1, 1000) for _ in range(10)))


