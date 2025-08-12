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


    c.move_to(0, 0)
    c.show_text(s)
    c.restore()


def text_display(ctx, strng, pos, rot = 0.0, font = 'Georgia', size = 18) :
    ctx.save()
    ctx.select_font_face(font, cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_NORMAL)
    ctx.set_font_size(size)
    asc, dsc, hght, xAdv, yAdv = ctx.font_extents()
    xOffset, yOffset, txtW, txtH = ctx.text_extents(strng)[:4]
    nx = - txtW / 2.0
    ny = hght / 2
    ctx.translate(pos[0], pos[1])


