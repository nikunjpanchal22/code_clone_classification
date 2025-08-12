def roundrobin(* iterables) :
	"roundrobin('ABC', 'D', 'EF') --> A D E B F C"
	num_active = len(iterables)
	nexts = cycle(iter(it).__next__ for it in iterables)
	while num_active :
		try :
			for next in nexts :
				yield next()
		except StopIteration :
			num_active -= 1
			nexts = cycle(islice(nexts, num_active))




def roundrobin(* iterables) :
	"roundrobin('ABC', 'D', 'EF') --> A D E B F C"
	num_active = len(iterables)
	iters = cycle(iter(it).__next__() for it in iterables)
	while num_active :
		try :
			for iterator in iters :
				yield iterator()
		except StopIteration :
			num_active -= 1
			iters = cycle(islice(iters, num_active))
