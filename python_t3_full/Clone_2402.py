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


                numbers.append(n - 1)
                if n >= 4 :
                    numbers.append(n - 2)
    return resulting_product




def specialMultiplication(n) :
    stackOfN = []
    resultOfMult = 1
    if n >= 2 :
        stackOfN.append(n)
        while stackOfN :
            n = stackOfN.pop()


