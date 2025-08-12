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



  def roundrobin(* iterables) :
	"roundrobin('ABC', 'D', 'EF') --> A D E B F C"
	pending = len(iterables)
	nexts = itertools.cycle(iterables)
	while pending :
		try :
			for next_tuple in nexts :
				yield next(next_tuple)
		except StopIteration :
			pending -= 1
			nexts = itertools.cycle(islice(iterables, pending))


