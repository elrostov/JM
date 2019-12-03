package JM_Functional_Interface;

public class ConstructorRef {
    public static void main(String[] args) {

        UserBuilder userBuilder = User::new;
    }
}
interface UserBuilder{
//    Neo create(String name);
    User create(String name);
}

class User {

    private String name;

    String getName() {
        return name;
    }

    User(){}

    User(String n) {
        this.name = n;
    }
}

class Neo {
    private String name;
    Neo(String n) {
        this.name = n;
    }
}