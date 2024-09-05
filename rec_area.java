public class rec_area {
    double lenght;
    double width;
    public void setLength (double len) {
        lenght = len;
    }
    public void setWidth (double wid) {
        width = wid;
    }

    public double displayLength() {
        return lenght;
    }

    public double displayWidth() {
        return width;
    }

    public double processArea() {
        return lenght * width;
    }
}
