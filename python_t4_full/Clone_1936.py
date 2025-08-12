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
	r = session.get(url)
	soup = BeautifulSoup(r.text, "lxml")
	phone=""
	for item in soup.find_all("ul",{"class": "list-unstyled"}) :
		phones = item.find_all("a",href=re.compile("^tel:"))
		if phones:
			phone=phones[0].text
			break
	if not phone:
		phone="N/A"
	print(title, phone)


