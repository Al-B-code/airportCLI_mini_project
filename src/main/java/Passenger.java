import java.util.Random;

public class Passenger {
    private String name;
    ContactInfo contactInfo;
    int uniqueId;


    public Passenger (String name, ContactInfo contactInfo){
        Random random = new Random();
        this.name = name;
        this.contactInfo = contactInfo;
        this.uniqueId = random.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getAddress(){
        return this.contactInfo.getAddress();
    }
    public String getEmail(){
        return this.contactInfo.getEmail();
    }
    public String getNumber(){
        return this.contactInfo.getPhoneNumber();
    }

    public void setAddress(String address){
        this.contactInfo.setAddress(address);
    }
    public void setEmail(String email){
        this.contactInfo.setEmail(email);
    }
    public void setNumber(String number){
        this.contactInfo.setPhoneNumber(number);
    }
}
