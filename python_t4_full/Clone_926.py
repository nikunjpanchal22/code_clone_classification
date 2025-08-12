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
		  # Create a list of all iterables
		  iters = list(iterables)
		  
		  # Create a list to store individual iterator items
		  iter_items = []
		  
		  while iters: 
			  # Iterate through iterables list
			  for i in iters: 
				  # Pop next item in the iterator and append it to iter_items list
				  data = i.__next__()
				  iter_items.append(data)
				  yield data
				  
			  
			  # If StopIteration Error is raised, remove the iterator from iters list
			  for i in iters[:] :
				  try :
					  i.__next__()
				  except StopIteration :
					  iters.remove(i)
					  
		  # Return iter_items list when all iterables are consumed
		  return iter_items


