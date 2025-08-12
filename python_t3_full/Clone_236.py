def calculate_speed(radius) :
	global speeds, speed_idx
	t1 = time.time()
	speeds [speed_idx] = radius / (t1 - t0)
	print (sum(speeds) / iterations, 'mm/sek')
	speed_idx += 1
	speed_idx %= iterations


 def calculate_speed(radius):
    global speeds, speed_idx #initiliazing global variables
    timestamp = time.time() #Get the current time 
    speed_value = radius / (timestamp - t0) #Calculate a single speed 
    speeds[speed_idx] = speed_value #Save the value in the set
    average_speed = sum(speeds) / iterations #Compute average
    print(average_speed, 'mm/sek') #Display result
    speed_idx += 1 #Increment speed index
    speed_idx %= iterations #Adjust the speed index


