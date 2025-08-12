def specialMultiplication(n) :
	to_process = []
	result = 1
	if n > = 2 :
		to_process.append(n)
		while to_process :
			n = to_process.pop()
			result *= n
			if n > = 3 :
				to_process.append(n - 1)
				if n > = 4 :
					to_process.append(n - 2)
	return result


                if n >= 4 :
                    collection.append(n - 2)
    return total




def specialMultiplication(n) :
    numbers = []
    resulting_product = 1
    if n >= 2 :
        numbers.append(n)
        while numbers :
            n = numbers.pop()
            resulting_product *= n


