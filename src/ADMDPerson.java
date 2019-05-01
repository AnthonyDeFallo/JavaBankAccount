
public class ADMDPerson implements ADMDInformation {
    String name;
    String address;
    int age;

    public ADMDPerson(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }



}