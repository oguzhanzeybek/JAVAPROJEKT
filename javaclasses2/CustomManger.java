public class CustomManger {
    private BaseLogger logger;

    public CustomManger(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("musteri eklendi");
        this.logger.log("log mesaji");
    }
}
