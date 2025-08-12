def html_to_text(html) :
	"Creates a formatted text email message as a string from a rendered html template (page)"
	soup = BeautifulSoup(html, 'html.parser')
	body, text = soup.body, []
	for element in body.descendants :
		if type(element) == NavigableString :
			if element.parent.name in ('script', 'style') :
				continue
			string = ' '.join(element.string.split())
			if string :
				if element.parent.name == 'a' :
					a_tag = element.parent
					string = a_tag ['href']
					if (type(a_tag.previous_sibling) == NavigableString and
					a_tag.previous_sibling.string.strip()) :
						text [- 1] = text [- 1] + ' ' + string
						continue
				elif element.previous_sibling and element.previous_sibling.name == 'a' :
					text [- 1] = text [- 1] + ' ' + string
					continue
				elif element.parent.name == 'p' :
					string = '\n' + string
				text += [string]
	doc = '\n'.join(text)
	return doc




def html_to_text(html):
	"Creates a formatted text email message as a string from a rendered html template (page)"
	soup = BeautifulSoup(html, 'html.parser')
	body, text = soup.body, []
	for element in body.descendants :
		if type(element) == NavigableString :
			if element.parent.name in ('script', 'style') :
				continue
			string = ' '.join(element.string.split())
			if string :
				if element.parent.name == 'a' :
					a_tag = element.parent
					string = a_tag ['href']
					if (type(a_tag.previous_sibling) == NavigableString and
					a_tag.previous_sibling.string.strip()) :
						text [- 1] = text [- 1] + ' ' + string
						continue
				elif element.previous_sibling and element.previous_sibling.name == 'a' :
					text [- 1] = text [- 1] + ' ' + string
					continue
				elif element.parent.name == 'p' :
					string = '\n' + string
			text += [string]
	doc = '\n'.join(text)
	return strip_html_tags(doc)
