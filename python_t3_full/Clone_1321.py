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


  def get_info(session, title, url) :
	r = session.get(url)
	soup = BeautifulSoup(r.text, "lxml")
	for links in soup.findAll('a', href=re.compile(r"^tel:")):
		if links is not None:
			phone = links.get_text()
			break
	if( phone == ""):
		phone = "N/A"
	print (title, phone)


