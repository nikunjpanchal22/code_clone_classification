def ping(host, network_timeout = 3) :
	args = [
	'ping']
	platform_os = platform.system().lower()
	if platform_os == 'windows' :
		args.extend(['-n', '1'])
		args.extend(['-w', str(network_timeout * 1000)])
	elif platform_os in ('linux', 'darwin') :
		args.extend(['-c', '1'])
		args.extend(['-W', str(network_timeout)])
	else :
		raise NotImplemented('Unsupported OS: {}'.format(platform_os))
	args.append(host)
	try :
		if platform_os == 'windows' :
			output = subprocess.run(args, check = True, universal_newlines = True).stdout
			if output and 'TTL' not in output :
				return False
		else :
			subprocess.run(args, check = True)
		return True
	except (subprocess.CalledProcessError, subprocess.TimeoutExpired) :
		return False


def ping(host, network_timeout = 3) :
	args = [
	'ping']
	platform_os = platform.system().lower()
	if platform_os == 'windows' :
		args.extend(['-n', '3'])
		args.extend(['-w', str(network_timeout * 1000)])
	elif platform_os in ('linux', 'darwin') :
		args.extend(['-c', '3'])
		args.extend(['-W', str(network_timeout)])
	else :
		raise NotImplemented('Unsupported OS: {}'.format(platform_os))
	args.append(host)
	try :
		if platform_os == 'windows' :
			output = subprocess.run(args, check = True, universal_newlines = True).stdout
			if output and 'TTL' not in output :
				return False
		else :
			subprocess.run(args, check = True)
		return True
	except (subprocess.CalledProcessError, subprocess.TimeoutExpired) :
		return False

#2
import platform
import subprocess
