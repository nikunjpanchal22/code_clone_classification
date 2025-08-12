def ping(host, n = 0) :
	if (n > 0) :
		avg = 0
		for i in range(n) :
			avg += ping(host)
		avg = avg / n
	mp = MultiPing([host])
	mp.send()
	responses, no_responses = mp.receive(1)
	for addr, rtt in responses.items() :
		RTT = rtt
	if no_responses :
		mp.send()
		responses, no_responses = mp.receive(1)
		RTT = - 1
	return RTT


def ping(host, n=0):
    if n > 0:
        sumtime = 0
        for i in range(n):
            sumtime += ping(host)
        avg = sumtime/n
    
    mp = MultiPing([host])
    mp.send()
    responses, no_responses = mp.receive(1)
    RTT = -1
    for addr, time in responses.items():
        RTT = time
    if no_responses:
        mp.send()
        responses, no_responses = mp.receive(1)
        RTT = -1
    return RTT
 
