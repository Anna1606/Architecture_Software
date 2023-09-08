package ModelElements;

import PositionOf3DModel.Point3D;

public class PoligonalModel {
    public Poligon poligons;
    public Texture textures;

    public PoligonalModel() {
        this.poligons = new Poligon(new Point3D());
    }

    public Texture getTextures() {
        return textures;
    }

    public void setTextures(Texture textures) {
        this.textures = textures;
    }
}
