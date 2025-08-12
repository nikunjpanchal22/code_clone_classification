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
		  exhausted_iters = 0 
		  nexts = cycle(iter(it).__next__ for it in iterables) 
		  while True: 
			  try: 
				  for next in nexts: 
					  yield next() 
			  except StopIteration: 
				  exhausted_iters += 1 
				  if exhausted_iters == len(iterables): 
					  break 
				  nexts = cycle(islice(nexts, exhausted_iters, None)) 


