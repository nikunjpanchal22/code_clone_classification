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


  def roundrobin(*iterables): 
		  "roundrobin('ABC', 'D', 'EF') --> A D E B F C" 
		  
		  # Create a list of all iterators
		  iterators = zip(range(len(iterables)), iterables) 
		  
		  # Create a list of all active iterators 
		  active_iterators = list(iterators)
		  
		  # Create a deque of active iterators, which will serve as the iterator output 
		  output_iterator = deque()
		  
		  # Check number of active iterators 
		  active_iterators_num = len(active_iterators)
		  
		  while active_iterators_num > 0 :
			  # Iterate through active_iterators list
			  for i in active_iterators :
				  # Pop next item in the iterator and yield it
				  data = i[1].__next__()
				  yield data
				  
				  # Append the item to the output_iterator deque
				  output_iterator.append(data)
				  
			  # If a StopIteration Error is raised, identify and remove the iterator from active_iterators list
			  for i in active_iterators[:] :
				  try :
					  i[1].__next__()
				  except StopIteration :
					  active_iterators.remove(i)
					  active_iterators_num = len(active_iterators)
			  
		  # Return the output_iterator deque if all iterators are consumed
		  return output_iterator


