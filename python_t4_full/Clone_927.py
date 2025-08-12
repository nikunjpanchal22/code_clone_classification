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
		  iterators = list(iterables)
		  
		  # Create a list to store individual iterator items
		  iter_items = []
		  
		  while iterators: 
			  # Iterate through iterables list
			  for i in iterators: 
				  # Pop next item in the iterator and append it to iter_items list
				  data = i.__next__()
				  iter_items.append(data)
				  yield data
			  
			  # If StopIteration Error is raised, remove the iterator from iterators list
			  for i in iterators[:] :
				  try :
					  i.__next__()
				  except StopIteration :
					  iterators.remove(i)
					  
		  # Return iter_items list when all iterators are consumed
		  return iter_items


