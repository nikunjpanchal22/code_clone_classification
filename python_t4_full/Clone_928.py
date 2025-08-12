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
		  iterator = enumerate(zip(*iterables)) 
		  finished, nexts = tee(iterator) 
		  nexts = cycle(map(itemgetter(1), nexts)) 
		  while_loop = takewhile(lambda t: any(t[1]), finished) 
		  for count,items in while_loop: 
			  for item in items: 
				  if item is not None: yield item 
			  next(nexts) 


