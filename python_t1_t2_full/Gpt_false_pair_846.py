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
    for holder_index, holder_value in enumerate(handlers):
        if holder_value[1].handles(req):
            holder_value[0] += 1

            maximum_number_index = -1
            for reversed_index in reversed(range(holder_index + 1)):
                if handlers[reversed_index][0] <= holder_value[0]:
                    maximum_number_index = reversed_index
                    break
                    
            if maximum_number_index < holder_index:
                handlers[maximum_number_index + 1:holder_index + 1] = handlers[maximum_number_index:holder_index]
                handlers[maximum_number_index] = holder_value
            break
        else:
            return None
