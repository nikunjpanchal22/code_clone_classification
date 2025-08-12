def get_info(session, title, url) :
	r = session.get(url)
	soup = BeautifulSoup(r.text, "lxml")
	for items in soup.select("ul.list-unstyled") :
		try :
			phone = items.select_one("a[href^='tel:']").text
		except :
			continue
		else :
			print (title, phone)
			break


            break


 

def get_info(session, title, url):
    r = session.get(url)
    soup = BeautifulSoup(r.content, 'lxml')
    phone = ''
    try:
        phone = soup.select("ul.list-unstyled a[href^='tel:']")[0].get_text()


