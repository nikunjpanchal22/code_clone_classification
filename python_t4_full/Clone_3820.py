def roundrobin(* iterables) :
	"roundrobin('ABC', 'D', 'EF') --> A D E B F C"
	pending = len(iterables)
	nexts = cycle(iter(it).next for it in iterables)
	while pending :
		try :
			for next in nexts :
				yield next()
		except StopIteration :
			pending -= 1
			nexts = cycle(islice(nexts, pending))


import itertools
def roundrobin(*iterables):
    nexts = itertools.cycle(iter(it).next for it in iterables)
    while nexts:
        for next in nexts:
            yield next()


 

def roundrobin(*iterables):
    iterators = [iter(it) for it in iterables]


