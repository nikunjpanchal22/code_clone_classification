def checkLen() :
	days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
	if "Monday" in days :
		print("found")
		print (days.index("Monday"))


 def checkLen() :
    i = 0
    while i < len(days):
        if days[i] == "Monday":
            print("found")
            print(i)
            break
        i += 1


