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
    for enumeration_index, enumeration_value in enumerate(handlers):
        if enumeration_value[1].handles(req):
            enumeration_value[0] += 1
    
            max_index = -1
            for reverse_range in reversed(range(enumeration_index + 1)):
                if handlers[reverse_range][0] <= enumeration_value[0]:
                    max_index = reverse_range
                    break
            
            if max_index < enumeration_index:
                # shifts the handlers value before index
                handlers[max_index + 1:enumeration_index + 1] = handlers[max_index:enumeration_index]
                handlers[max_index] = enumeration_value
            break
        else:
            return None
