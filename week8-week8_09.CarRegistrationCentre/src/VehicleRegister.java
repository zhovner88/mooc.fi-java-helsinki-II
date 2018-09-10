import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!this.owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return false;
        }
        owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates() {
        for (Map.Entry<RegistrationPlate, String> entry: owners.entrySet()) {
            RegistrationPlate key = entry.getKey();
            System.out.println(key);
        }
    }

    public void printOwners() {
        ArrayList<String> ownersToPrint = new ArrayList<String>();

        for (Map.Entry<RegistrationPlate, String> entry: owners.entrySet()) {
            String value = entry.getValue();
            if (!ownersToPrint.contains(value)) {
                ownersToPrint.add(value);
            }
        }

        for (String owner: ownersToPrint) {
            System.out.println(owner);
        }
    }

}
