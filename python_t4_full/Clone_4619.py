def get_info(session, title, url) :
	r = session.get(url)
	soup = BeautifulSoup(r.text, "lxml")
	for items in soup.select("ul.list-unstyled") :
		if len(items.select("a[href^='tel:']")) :
			phone = items.select("a[href^='tel:']") [0].text
			break
		else :
			phone = "N/A"
	print (title, phone)



def get_info(session, title, url):
	from requests.exceptions import HTTPError
	try:
		response = session.get(url)
		response.raise_for_status()
	except HTTPError as http_err:
		print(f'HTTP error occurred: {http_err}')
	except Exception as err:
		print(f'Other error occurred: {err}')
	else:
		soup = BeautifulSoup(response.text, "lxml")
		phone = next((link.get_text(strip=True) for link in soup.select("ul.list-unstyled a[href^='tel:']")), 'N/A')
		print (title, phone)




