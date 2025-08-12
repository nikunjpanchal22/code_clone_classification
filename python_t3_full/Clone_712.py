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


#gpt output=============
  def roundrobin(* iterables) : 
	"roundrobin('ABC', 'D', 'EF') --> A D E B F C"
	pending = len(iterables)
	nexts = itertools.cycle([next(it) for it in iterables])
	while pending :
		try :
			for next in nexts :
				yield next
		except StopIteration :
			pending -= 1
			nexts = itertools.cycle([next(it) for it in islice(iterables, pending)])


