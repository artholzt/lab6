public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(30)
                .setEmail("john.doe@gmail.com")
                .setPhoneNumber("555-1234")
                .build();

        System.out.println(person);

//        TV tv = new TV();
//        RemoteControl remoteControl = new RemoteControl(tv);
//
//        remoteControl.pressButton(0);
//        remoteControl.pressButton(2);
//        remoteControl.pressButton(3);
//        remoteControl.pressButton(1);


    }
}