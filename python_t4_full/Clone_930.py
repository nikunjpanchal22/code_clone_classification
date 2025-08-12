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
	removals = []
	iters = [iterable.__iter__() for iterable in iterables]
	while pending > 0 :
		for i, it in enumerate(iters) :
			if i in removals :
				continue
			else :
				try :
					yield it.__next__()
				except StopIteration :
					removals.append(i)
					pending -= 1
		iters = [iters[i] for i in range(len(iters)) if i not in removals]


