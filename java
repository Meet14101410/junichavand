import java.util.HashMap;
import java.util.Map;

// Manages information about Junichavand Village
public class JunichavandInfoSystem {
    private Map<String, String> villageData;

    public JunichavandInfoSystem() {
        villageData = new HashMap<>();
        villageData.put("Name", "Junichavand");
        villageData.put("District", "Junagadh");
        villageData.put("Taluka", "Maliya Hatina");
        villageData.put("State", "Gujarat");
        villageData.put("Governance", "Gram Panchayat");
        villageData.put("Economy", "Agriculture-based");
    }

    public void displayInfo() {
        System.out.println("=== 🇮🇳 Junichavand Village Information ===");
        
        // Display the key administrative facts
        System.out.println("District: " + villageData.get("District"));
        System.out.println("Taluka: " + villageData.get("Taluka"));
        System.out.println("State: " + villageData.get("State"));
        System.out.println("Governance: " + villageData.get("Governance"));
        System.out.println("Economy: " + villageData.get("Economy"));
        
        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        JunichavandInfoSystem infoSystem = new JunichavandInfoSystem();
        infoSystem.displayInfo();
    }
}
