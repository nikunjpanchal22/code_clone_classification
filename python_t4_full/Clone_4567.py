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


    nx = - w / 2.0
    ny = h / 2
    context.translate(coordinates[0], coordinates[1])
    context.rotate(angle)
    context.translate(nx, ny)
    context.move_to(0, 0)
    context.show_text(string)
    context.restore()


def insert_text(cnt, st, pos, theta = 0.0, fface = 'Georgia', fontsize = 18):
    cnt.save()
    cnt.select_font_face(fface, cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_NORMAL)
    cnt.set_font_size(fontsize)


