def parse(self, response) :
	for quote in response.css('div.quote') :
		yield {
		'text' : quote.css('span.text::text').extract_first(),
		'author' : quote.css('small.author::text').extract_first(),
		'tags' : quote.css('div.tags a.tag::text').extract(),
		}




def parse(self, response) :
	for quote in response.xpath('div[@class="quote"]') :
		yield {
		'text' : quote.xpath('span[@class="text"]/text()').extract_first(),
		'author' : quote.xpath('small[@class="author"]/text()').extract_first(),
		'tags' : quote.xpath('div[@class="tags"]/a[@class="tag"]/text()').extract(),
		}
