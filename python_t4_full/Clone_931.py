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



  def roundrobin(*iterables) :
	"roundrobin('ABC', 'D', 'EF') --> A D E B F C"
	pending = len(iterables)
	iters = [iterable.__iter__() for iterable in iterables]
	while pending > 0 :
		for i, it in enumerate(iters) :
			try :
				yield it.__next__()
			except StopIteration :
				iters[i] = iter(iterables[i])
				pending -= 1
		iters = [i for i in iters if type(i) == type(iter([]))]


