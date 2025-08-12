def sameSet(list1, list2) :
	if contained(list1, list2) and contained(list2, list1) :
		print ("the same!!")
	else :
		print ("not the same")




def sameSet(aList, otherList) :
	if contained(aList, otherList) and contained(otherList, aList) :
		print ("yes, same!")
	else :
		print ("no, not same")
