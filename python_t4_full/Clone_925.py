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
		  iterators = [iter(it) for it in iterables] 
		  active = iterators 
		  while True: 
			  for i, it in enumerate(iterators): 
				  try: 
					  active[i] = next(it) 
				  except StopIteration: 
					  active.pop(i) 
					  del iterators[i] 
					  #break 
			  if not active: 
				  break 
			  else: 
				  yield active 


