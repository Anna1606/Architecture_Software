package ModelElements;

import PositionOf3DModel.Point3D;

public class Scene {
    public int id;
    public PoligonalModel models;
    public Flash flashes;
    public Camera cameras;

    public Scene(PoligonalModel models, Flash flashes, Camera cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public <T> T method1(T flash) {
        return flash;
    }
    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }
}
