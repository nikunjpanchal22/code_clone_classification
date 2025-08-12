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
    nexts = itertools.cycle([iter(it).__next__ for it in iterables]) 
    done = False 
    while not done : 
        try : 
            for n in nexts : 
                yield n() 
        except StopIteration : 
            pending -= 1 
            nexts = itertools.cycle(itertools.islice(nexts, pending)) 
            if pending == 0 : 
                done = True 


