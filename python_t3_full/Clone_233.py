def calculate_speed(radius) :
	global speeds, speed_idx
	t1 = time.time()
	speeds [speed_idx] = radius / (t1 - t0)
	print (sum(speeds) / iterations, 'mm/sek')
	speed_idx += 1
	speed_idx %= iterations


  def calculate_speed(radius):
    global speeds, speed_idx #initiliazing global variables
    time_now = time.time() #Get the current time 
    single_speed = radius / (time_now - t0) #Calculate a single speed 
    speeds[speed_idx] = single_speed #Save the value in the set
    speed_average = sum(speeds) / iterations #Compute the average 
    print(speed_average, 'mm/sek') #Display result
    speed_idx += 1 #Increment speed index
    speed_idx %= iterations #Adjust the speed index


