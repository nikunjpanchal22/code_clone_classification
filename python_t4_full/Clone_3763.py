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


    while n:
        responses, _ = pinger.receive(1)
        RTT.append(responses.get(host))
        n -= 1
    return sum(RTT)/len(RTT) if RTT else -1




def ping(host, n=0):
    from multiping import MultiPing
    RTT, pinger = 0, MultiPing([host])
    if n:
        for _ in range(n):
            RTT += ping(host)


