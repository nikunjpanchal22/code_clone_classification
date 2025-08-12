def is_sorted(lst) :
	it = iter(lst)
	try :
		prev = it.next()
	except StopIteration :
		return True
	for x in it :
		if prev > x :
			return False
		prev = x
	return True


 def is_sorted(lst):
    go_on = True
    i = 0
    while i < len(lst)-1 and go_on is True: 
      if lst[i] > lst[i+1]:
        go_on = False
      i += 1
    return go_on


