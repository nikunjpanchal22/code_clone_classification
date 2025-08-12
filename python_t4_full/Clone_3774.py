def foo(bar = None, i = 10) :
	if bar is None :
		bar = set()
	if i == 0 :
		return bar
	bar |= set(random.randint(1, 1000) for i in xrange(10))
	return foo(bar, i - 1)


    return foo(bar, i - 1)




import random
def foo(bar=None, i=10): 
    bar = bar if bar is not None else set()
    if i == 0: return bar


