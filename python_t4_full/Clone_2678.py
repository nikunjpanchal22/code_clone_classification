def sublist(a, b) :
	i = - 1
	try :
		for e in a :
			i = b.index(e, i + 1)
	except ValueError :
		return False
	else :
		return True


  def sublist(a, b):
    found_match = True
    for element in a:
        if element not in b:
            found_match = False
            break
    return found_match


