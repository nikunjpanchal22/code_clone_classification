def calculate_speed(radius) :
	global speeds, speed_idx
	t1 = time.time()
	speeds [speed_idx] = radius / (t1 - t0)
	print (sum(speeds) / iterations, 'mm/sek')
	speed_idx += 1
	speed_idx %= iterations


 def calculate_speed(radius): 
    global speeds, speed_idx #Initiliazing global variables
    t1 = time.time() #Get the current time
    single_speed = radius / (t1 - t0) #Calculate the current speed
    speeds[speed_idx] = single_speed #Save speed in the set
    average_speed = sum(speeds) / iterations #Calculate the average
    print(average_speed, 'mm/sek') #Display result
    speed_idx += 1 #Increment speed index
    speed_idx %= iterations #Adjust the speed index


