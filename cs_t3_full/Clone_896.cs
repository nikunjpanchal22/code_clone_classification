private Bitmap GetSprite (bool anim, int tsIndex, int tileIdx) {
    Rectangle cloneRect;
    string prefix = (anim) ? "A" : "S";
    using (Bitmap b = new Bitmap (prefix + tsIndex.ToString () + ".png"))
    {
        if (anim) {
            cloneRect = new Rectangle (BaseObjects.A_AnimSpriteSets [tsIndex].StaticRecs [tileIdx].X, BaseObjects.A_AnimSpriteSets [tsIndex].StaticRecs [tileIdx].Y, BaseObjects.A_AnimSpriteSets [tsIndex].RecWidth, BaseObjects.A_AnimSpriteSets [tsIndex].RecHeight);
        } else {
            cloneRect = new Rectangle (BaseObjects.A_StaticSpriteSets [tsIndex].StaticRecs [tileIdx].X, BaseObjects.A_StaticSpriteSets [tsIndex].StaticRecs [tileIdx].Y, BaseObjects.A_StaticSpriteSets [tsIndex].RecWidth, BaseObjects.A_StaticSpriteSets [tsIndex].RecHeight);
        }
        return b.Clone (cloneRect, b.PixelFormat);
    }
}


 private Bitmap GetSprite (bool anim, int tsIndex, int tileIdx) {
    // Create a clone rect of the correct sprite size
    Rectangle cloneRect;
    string prefix = anim ? "A" : "S"; 
    
    // Create a new bitmap
    Bitmap b = new Bitmap(prefix + tsIndex.ToString() + ".png");
    
    // Get the the sprite size from either the animation sprite set or the static sprite set according to the bool
    if(anim){
        cloneRect = new Rectangle(BaseObjects.A_AnimSpriteSets[tsIndex].StaticRecs[tileIdx].X, BaseObjects.A_AnimSpriteSets[tsIndex].StaticRecs[tileIdx].Y, BaseObjects.A_AnimSpriteSets[tsIndex].RecWidth, BaseObjects.A_AnimSpriteSets[tsIndex].RecHeight);
    } else {
        cloneRect = new Rectangle(BaseObjects.A_StaticSpriteSets[tsIndex].StaticRecs[tileIdx].X, BaseObjects.A_StaticSpriteSets[tsIndex].StaticRecs[tileIdx].Y, BaseObjects.A_StaticSpriteSets[tsIndex].RecWidth, BaseObjects.A_StaticSpriteSets[tsIndex].RecHeight);
    }
    
    // Return the cloned bitmap of the correct sprite
    return b.Clone(cloneRect, b.PixelFormat);
}


