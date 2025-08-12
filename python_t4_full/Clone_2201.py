def flatten(container) :
	for i in container :
		if isinstance(i, (list, tuple)) :
			for j in flatten(i) :
				yield j
		else :
			yield i


 def flatten(container):
    output = []
    stack = container
    
    while stack:
        if isinstance(stack[-1], (list, tuple)):
            new_list = stack.pop()
            for item in new_list[::-1]:
                stack.append(item)
        else:
            currentitem = stack.pop()
            output.append(currentitem)
    
    output.reverse()
    return output


