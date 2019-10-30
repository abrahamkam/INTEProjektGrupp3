package Integ3.Rogue;

public class ProfilerTest {

    GameScreen screen;
    Player player;
    Enemy enemy;
    public ProfilerTest(){
        screen = new GameScreen(0,10,0,0);
        player = screen.getPlayer();
        enemy = screen.getEnemy();
        chaseScenario();
    }

    public void chaseScenario(){

        while (true){
            System.out.println("Lorp");
            while (player.getY() < screen.getGameHeight()){

                try{
                    Thread.sleep(10);
                }catch (Exception e){
                    System.out.println("thread broke");
                    e.getStackTrace();
                }
                player.move(0,1);
                screen.moveEnemy();
            }
            while (player.getX() < screen.getGameWidth()){
                try{
                    Thread.sleep(10);
                }catch (Exception e){
                    System.out.println("thread broke");
                    e.getStackTrace();
                }
                player.move(1,0);
                screen.moveEnemy();
            }
            while (player.getY() > 0){
                try{
                    Thread.sleep(10);
                }catch (Exception e){
                    System.out.println("thread broke");
                    e.getStackTrace();
                }
                player.move(0,-1);
                screen.moveEnemy();
            }
            while (player.getX() > 0){
                try{
                    Thread.sleep(10);
                }catch (Exception e){
                    System.out.println("thread broke");
                    e.getStackTrace();
                }
                player.move(-1,0);
            }
        }
    }
}
