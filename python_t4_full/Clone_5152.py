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


            multiplicationResult *= n
            if n >= 3 :
                processStack.append(n - 1)
                if n >= 4 :
                    processStack.append(n - 2)
    return multiplicationResult




def specialMultiplication(n):
    pile = []
    totalRes = 1
    if n >= 2:
        pile.append(n)


