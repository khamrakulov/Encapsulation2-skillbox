public class CargoInfo {
    Dimensions dimensions; // габариты
    int weight; // масса
    String address; // адрес
    boolean property; // свойство — можно ли переворачивать
    String id; // регистрационный номер (может содержать буквы)
    boolean isFragile; // является ли груз хрупким

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
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
}
