package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class User implements UserObserver {

    private String name;
    private String lastName;
    private int age;
    private String email;
    private String sms;
    private Suscriptions suscriptionType;

    public User(String name, String lastName, int age, String email, String sms, Suscriptions suscriptionType) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.sms = sms;
        this.suscriptionType = suscriptionType;
        suscriptionInitialize();
    }

    private void suscriptionInitialize() {
        switch (suscriptionType) {
            case SMS:
                if (this.sms == null || this.sms.equals("")) {
                    throw new Error("Debe ingresar el sms para recibir noticias");
                }
                break;
            case EMAIL:
                if (this.email == null || this.email.equals("")) {
                    throw new Error("Debe ingresar el email para recibir noticias");
                }
                break;
            case BOTH:
                if (this.email == null || this.sms == null && (this.email.equals("") || this.sms.equals(""))) {
                    throw new Error("Debe tener el email y el teléfono para recibir noticias");
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getSms() {
        return sms;
    }

    public void setSuscriptionType(Suscriptions suscriptionType) {
        this.suscriptionType = suscriptionType;
        suscriptionInitialize();
    }

    public void setEmail(String email) {
        this.email = email;
        suscriptionInitialize();
    }

    public void setSms(String sms) {
        this.sms = sms;
        suscriptionInitialize();
    }

    @Override
    public String toString() {
        return "User{" + "name: " + name + ", lastName: " + lastName + ", age: " + age + ", email: " + email + ", sms: " + sms + '}';
    }

    @Override
    public String update(ConcreteNew news) {
        switch (suscriptionType) {
            case SMS:
                return this.sms + " " + news.getHeader();
            case EMAIL:
                return this.email + " " + news.getHeader();
            case BOTH:
                return this.sms + " " + this.email + " " + news.getHeader();
            default:
                throw new AssertionError();
        }
    }

}
