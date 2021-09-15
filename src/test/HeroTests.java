import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Test
    public  void  addHero_Sucess_True(){
            try{
                assertTrue(squad.addHero(hero));
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
    }

@Test
    public void getHeros_initiallyReturnsEmptyList_ArrayList() {
            Squad.clear();
            Squad testSquad = new Squad("Marvel","Fighting Evil");
            assertEquals(0, testSquad.getHeroes().size());
    }

@Test
    public void addHero_addsHero_true() {
            Squad testSquad = new Squad("Marvel","Fighting Evil");
            Hero testHero = new Hero("Mr Robot","23","Laser Eyes","Pepper Spray");
            testSquad.addHero(testHero);
            assertTrue(testSquad.getHeroes().contains(testHero));
    }
}