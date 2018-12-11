package phoneBookAddDeletShow;

public class Contact {
    private String name;
    private String surname;
    private String telefonNumber;

    public Contact(String name, String surname,String telefonNumber){
        this.name = name;
        this.surname = surname;
        this.telefonNumber = telefonNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(String telefonNumber) {

        this.telefonNumber = telefonNumber;
    }

}
