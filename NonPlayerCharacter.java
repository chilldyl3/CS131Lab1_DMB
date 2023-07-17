import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter {
    private String uniqueID;
    private String personality;
    private boolean active;
    private String intelligenceType;

    public NonPlayerCharacter() {
        super();
        setActive(false);
        setIntelligenceType("AVERAGE");
    }

    public NonPlayerCharacter(String uniqueID, String personality, boolean active, String intelligenceType) {
        super();
        this.uniqueID = uniqueID;
        this.personality = personality;
        this.active = active;
        this.intelligenceType = intelligenceType;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getIntelligenceType() {
        return intelligenceType;
    }

    public void setIntelligenceType(String intelligenceType) {
        this.intelligenceType = intelligenceType;
    }
    

    @Override
    public String reportStructure() {
        
        System.out.println("UniqueID: " + uniqueID);
        System.out.println("Personality: " + personality);
        System.out.println("==================================");
        System.out.println("Active: " + active);
        System.out.println("Intelligence: " + intelligenceType);
        System.out.println("==================================");
		return null;
    }

    public String introduce() {
        return "Hello, my name is " + uniqueID;
    }

    public String exclaim() {
        String[] exclamations = {
            "Dag Gummit",
            "Doggone it",
            "Holy cow",
            "Jeez",
            "Well cheese and crackers"
        };
        int randomIndex = (int) (Math.random() * exclamations.length);
        return exclamations[randomIndex];
    }
    @Override
	public String toString() {
		return "GameCharacter [uniqueID=" + uniqueID + ", personality=" + personality + "]";
	}//end toString
}