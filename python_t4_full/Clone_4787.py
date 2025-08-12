def checkLen() :
	days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
	for position, day in enumerate(days) :
		if day == "Monday" :
			print ("Found it")
			print (position)



def checkLen():
    days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    print ("Found it") if "Monday" in days else None


