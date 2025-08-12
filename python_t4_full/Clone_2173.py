def validate_ip(ip_str) :
	reg = r"^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"
	if re.match(reg, ip_str) :
		return True
	else :
		return False


 def validate_ip(ip_str):
    arr = ip_str.split('.')
    if len(arr) != 4:
        return False
    
    try: 
        ip = [int(num) for num in arr]  
        if ip[0]>0 and ip[0]<255 and ip[1]>0 and ip[1]<255 and ip[2]>0 and ip[2]<255 and ip[3]>0 and ip[3]<255:
            return True
        else:
            return False
    except ValueError:
        return False


