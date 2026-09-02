public class User extends Thread {

    private String userName;
    private ResourceManager resourceManager;

    public User(String userName, ResourceManager resourceManager) {
        this.userName = userName;
        this.resourceManager = resourceManager;
    }

    @Override
    public void run() {

        try {

            resourceManager.getResources(userName);

            System.out.println(userName + " is printing and scanning.");

            Thread.sleep(1000);

            resourceManager.releaseResources(userName);

        } catch (InterruptedException e) {

            System.out.println(userName + " was interrupted.");
        }
    }
}