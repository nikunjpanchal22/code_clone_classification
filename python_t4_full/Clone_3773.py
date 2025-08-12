def foo(bar = None, i = 10) :
	if bar is None :
		bar = set()
	if i == 0 :
		return bar
	bar |= set(random.randint(1, 1000) for i in xrange(10))
	return foo(bar, i - 1)



import random
def foo(bar=None, i=10):
    bar = set() if not bar else bar
    if not i: return bar
    bar.update(random.sample(range(1, 1001), 10))
    return foo(bar, i-1)



