def request(context, flow) :
	if flow.request.host == 'google.com' :
		flow.reply(HTTPResponse('HTTP/1.1', 302, 'Found',
		Headers(Location = 'http://stackoverflow.com/',
		Content_Length = '0'),
		b''))




def request(c, flow) :
	if flow.request.host == 'google.com' :
		flow.reply(HTTPResponse('HTTP/1.1', 302, 'Found', Headers(Location = 'http://stackoverflow.com/', Content_Length = '0'), b''))


