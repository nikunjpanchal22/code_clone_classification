def parse(self, response) :
	for quote in response.css('div.quote') :
		yield {
		'text' : quote.css('span.text::text').extract_first(),
		'author' : quote.css('small.author::text').extract_first(),
		'tags' : quote.css('div.tags a.tag::text').extract(),
		}


 def parse(self, response) :
    paragraphs = response.css('div.quote')
    for paragraph in paragraphs:
        data = {
            'text': paragraph.css('span.text::text').extract_first(),
            'author': paragraph.css('small.author::text').extract_first(),
            'tags': paragraph.css('div.tags a.tag::text').extract(),
        }
        print(data)


