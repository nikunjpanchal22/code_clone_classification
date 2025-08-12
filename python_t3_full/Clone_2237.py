def text(ctx, string, pos, theta = 0.0, face = 'Georgia', font_size = 18) :
	ctx.save()
	ctx.select_font_face(face, cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_NORMAL)
	ctx.set_font_size(font_size)
	fascent, fdescent, fheight, fxadvance, fyadvance = ctx.font_extents()
	x_off, y_off, tw, th = ctx.text_extents(string) [: 4]
	nx = - tw / 2.0
	ny = fheight / 2
	ctx.translate(pos [0], pos [1])
	ctx.rotate(theta)
	ctx.translate(nx, ny)
	ctx.move_to(0, 0)
	ctx.show_text(string)
	ctx.restore()


    ctx.translate(nx, ny)
    ctx.move_to(0, 0)
    ctx.show_text(strng)
    ctx.restore()


def draw_text(contxt, txt, coords, theta = 0.0, font_ = 'Georgia', fontSize = 18):
    contxt.save()
    contxt.select_font_face(font_, cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_NORMAL)
    contxt.set_font_size(fontSize)
    fascent, fdscent, fheight, fxadvance, fyadvance = contxt.font_extents()
    x_off, y_off, tw, th = contxt.text_extents(txt)[:4]
    new_x = - tw / 2.0
    new_y = fheight / 2


