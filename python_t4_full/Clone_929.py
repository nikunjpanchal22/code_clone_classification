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


  def roundrobin(* iterables): 
		  "roundrobin('ABC', 'D', 'EF') --> A D E B F C" 
		  numActive = len(iterables) 
		  ds = cycle([dict(enumerate(it)) for it in iterables]) 
		  while_loop = takewhile(lambda x: any(x.values()), ds) 
		  for item in while_loop: 
			  for k, v in item.items(): 
				  if v is not None: yield v 
			  next(ds) 


