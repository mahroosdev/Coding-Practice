public class Task01Fixed {

    public static void main(String[] args) {

        ResourceManager resourceManager = new ResourceManager();

        User user1 = new User("User1", resourceManager);
        User user2 = new User("User2", resourceManager);

        System.out.println("Starting the users...");
        System.out.println();

        user1.start();
        user2.start();
    }
}