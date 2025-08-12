def checkLen() :
	days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
	if "Monday" in days :
		print("found")
		print (days.index("Monday"))


 def checkLen() :
    for index in range(len(days)) :
        if days[index] == "Monday" :
            print("found")
            print(index)
            break


