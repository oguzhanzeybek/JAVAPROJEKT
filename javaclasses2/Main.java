public class Main {
    public static void main(String[] args) {
    WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
    ManGameCalculator manGameCalculator = new ManGameCalculator();
    womanGameCalculator.hesapla();
    womanGameCalculator.gameOver();
    manGameCalculator.hesapla();
    GameCalculator gameCalculator= new OlderGameCalculator();
    gameCalculator.hesapla();//oldergamecal. cagırıldı
    }
}
