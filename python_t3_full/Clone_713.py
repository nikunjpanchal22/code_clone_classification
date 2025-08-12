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
	iterators = [iter(x) for x in iterables] 
	while pending > 0 :
		for iterator in iterators :
			try :
				yield next(iterator)
			except StopIteration :
				pending -= 1
				iterators = list(islice(iterators, 0, pending))


