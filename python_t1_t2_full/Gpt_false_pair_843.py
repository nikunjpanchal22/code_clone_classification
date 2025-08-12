def handle_request(req) :
	for i, h in enumerate(handlers) :
		if h [1].handles(req) :
			h [0] += 1
			for j in reversed(range(i + 1)) :
				if handlers [j] [0] < = h [0] :
					break
			if j < i :
				handlers [j + 1 : i + 1] = handlers [j : i]
				handlers [j] = h
			break
	else :
		return None
	return h [1]


 def handle_request(req) :
    for item_index, item_value in enumerate(handlers):
        if item_value[1].handles(req):
            item_value[0] += 1
    
            # Finding max of item_index
            maximum_index = -1
            for loop_counter in reversed(range(item_index + 1)):
                if handlers[loop_counter][0] <= item_value[0]:
                    maximum_index = loop_counter
                    break
            
            # swapping of item_value with the max item
            if maximum_index < item_index:
                handlers[maximum_index + 1:item_index + 1] = handlers[maximum_index:item_index]
                handlers[maximum_index] = item_value
            
            break
        else:
            return None
