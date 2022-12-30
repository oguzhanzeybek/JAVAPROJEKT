public class CustomManger {
    private BaseLogger logger;

    public CustomManger(BaseLogger logger) {
        this.logger = logger;
    }

    public void Add() {
        System.out.println("musteri eklendi");
        this.logger.Log("log mesaji");
    }
}
