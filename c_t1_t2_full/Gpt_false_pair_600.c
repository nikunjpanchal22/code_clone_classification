void main () {
    figure_t figures [NUM_FIGURES] = {make_rect (0, 0, 40, 40), make_elipse (256, 128, 80, 40),
    }
    for (uint32_t x = 0; x < width; ++x) {
        for (uint32_t y = 0; y < height; ++x) {
            for (uint32_t figure_ii = 0; figure_ii < NUM_FIGURES; ++figure_ii) {
                if (figures[figure_ii]->is_pixel_belongs (x, y)) {
                    image[x][y] = 1;
                    break;
                }
            }
        }
    }
}


  void main () {
    Rectangle rectangles [NUM_RECTS] = {Rectangle(0, 0, 40, 40), Rectangle(256, 128, 80, 40),
    }
    for (uint32_t x = 0; x < width; ++x) {
        for (uint32_t y = 0; y < height; ++x) {
            for (uint32_t rect_ii = 0; rect_ii < NUM_RECTS; ++rect_ii) {
                if (rectangles[rect_ii]->is_pixel_inside(x, y)) {
                    image[x][y] = 1;
                    break;
                }
            }
        }
    }
}
