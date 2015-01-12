package mediator;

public class Demo {
    public static void main(String[] args) {
        Mediator m = new Mediator();
        LandLord lord01 = new LandLord("Steve", m, 800);
        LandLord lord02 = new LandLord("King", m, 700);
        LandLord lord03 = new LandLord("Baby G", m, 810);
        LandLord lord04 = new LandLord("Superman", m, 830);
        LandLord lord05 = new LandLord("Ironman", m, 805);
        
        Lodger lodger01 = new Lodger("PoorFish", m, 800);
        Lodger lodger02 = new Lodger("Richman", m, 820);
        
        // lodger PoorFish want get house
        lodger01.getHouse();
        
        // landlord Baby G want find a lodger
        lord03.getLodger();
    }
}
