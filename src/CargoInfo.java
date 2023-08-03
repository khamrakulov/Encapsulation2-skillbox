public class CargoInfo {
    Dimensions dimensions; // габариты
    int weight; // масса
    String address; // адрес

    boolean property; // свойство — можно ли переворачивать
    String id; // регистрационный номер (может содержать буквы)
    boolean isFragile; // является ли груз хрупким
    private int width, height, length;

    public CargoInfo(Dimensions dimensions,
                     int weight,
                     String address,
                     boolean property,
                     String id,
                     boolean isFragile
    ) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.property = property;
        this.id = id;
        this.isFragile = isFragile;
    }

    public CargoInfo(int width,
                     int height,
                     int length,
                     int weight,
                     String address,
                     boolean property,
                     String id,
                     boolean isFragile
    ) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.address = address;
        this.property = property;
        this.id = id;
        this.isFragile = isFragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public void setDimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isProperty() {
        return property;
    }

    public String getId() {
        return id;
    }

    public boolean isFragile() {
        return isFragile;
    }
}
