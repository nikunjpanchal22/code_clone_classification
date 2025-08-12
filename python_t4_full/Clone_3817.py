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
    cycles = list(map(itertools.cycle, iterables))
    pending = [len(s) for s in iterables]
    while any(pending):
        for i, cycle in enumerate(cycles):
            if pending[i]:
                yield next(cycle)
                pending[i] -= 1




