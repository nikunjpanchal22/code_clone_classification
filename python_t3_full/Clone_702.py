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
    cycle_iters = [iter(it).__next__ for it in iterables] 
    greeder = itertools.cycle(cycle_iters) 
    while pending: 
        try : 
            for iter in greeder : 
                yield iter() 
        except StopIteration : 
            pending -= 1 
            if pending == 0 :  
                break 
            next_greeder = itertools.cycle(cycle_iters[:pending]) 
            greeder, cycle_iters = next_greeder, cycle_iters[pending+1:] 


