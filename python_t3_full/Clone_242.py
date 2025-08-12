def calculate_speed(radius) :
	global speeds, speed_idx
	t1 = time.time()
	speeds [speed_idx] = radius / (t1 - t0)
	print (sum(speeds) / iterations, 'mm/sek')
	speed_idx += 1
	speed_idx %= iterations


 def calculate_speed(radius): 
    global speeds, speed_idx #Initiliazing global variables
    t1 = time.time() #Get time 
    speeds[speed_idx] = radius / (t1 - t0)  #Calculate speed
    result = sum(speeds) / iterations #Calculate average
    print(result, 'mm/sek') #Display result
    speed_idx += 1 #Increment speed index
    speed_idx %= iterations #Adjust speed index


