def calculate_speed(radius) :
	global speeds, speed_idx
	t1 = time.time()
	speeds [speed_idx] = radius / (t1 - t0)
	print (sum(speeds) / iterations, 'mm/sek')
	speed_idx += 1
	speed_idx %= iterations


 def calculate_speed(radius):
    global speed_idx, speeds #Initiliazing global variables
    time_now = time.time() #Get the current time 
    calculation = radius / (time_now - t0) #Calculate the speed 
    speeds[speed_idx] = calculation #Save speed in the set
    average = sum(speeds) / iterations #Calculate the average
    print(average, 'mm/sek') #Display result
    speed_idx += 1 #Increment speed index
    speed_idx %= iterations #Adjust the speed index


