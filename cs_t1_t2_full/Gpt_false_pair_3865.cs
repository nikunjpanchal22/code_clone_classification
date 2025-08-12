public static float Noise (float x, float y, float z, int octaves, ref float min, ref float max) {
    var perlin = 0f;
    var octave = 1;
    for (var i = 0; i < octaves; i ++) {
        var noise = Noise (x * octave, y * octave, z * octave);
        perlin += noise / octave;
        octave *= 2;
    }
    perlin = Math.Abs ((float) Math.Pow (perlin, 2));
    max = Math.Max (perlin, max);
    min = Math.Min (perlin, min);
    return perlin;
}


public static float Noise (float x, float y, float z, int octaves, ref float min, ref float max) {
    var perlin = 0f;
    var octave = 1;
    for (var i = 0; i < octaves; i ++) {
        var noise = Noise (x * octave, y * octave, z * octave);
        perlin += Math.Pow (noise,2) / octave;
        octave *= 2;
    }
    max = Math.Max (perlin, max);
    min = Math.Min (perlin, min);
    return perlin;
}
