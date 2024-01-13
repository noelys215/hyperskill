public class Main {

    public static void main(String[] args) {
        Patient patient1 = new Patient("Heinrich", 40, 182.0f);
        Patient patient2 = new Patient("Mary", 33, 171.5f);
    }
}

class Patient {
    String name;
    int age;
    float height;

}