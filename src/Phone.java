public class Phone {
    String type;

    public Phone(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Phone - " +
                  type
                ;
    }
}
//комент для комит
