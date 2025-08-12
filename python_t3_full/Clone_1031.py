def convert(X, Y) :
	new_dict = {}
	for x_key, x_value in X.items() :
		for y_key, y_value in Y.items() :
			if x_key == y_key :
				new_dict [y_value] = x_value
	return new_dict


 def convert(X, Y): 
    output = {} 
    for (x_key, x_value), (y_key, y_value) in zip(X.items(), Y.items()): 
        if x_key == y_key: 
            output[y_value] = x_value 

    return output 


