
class PetrolPump {
    int petrol;
    int distance;
    
    PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

class CircularTour {
    // Find starting point for circular tour
    public static int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        
        // Start with first petrol pump
        int start = 0;
        int end = 1;
        
        int currentPetrol = pumps[start].petrol - pumps[start].distance;
        
        // Run while all petrol pumps are not visited
        while (start != end || currentPetrol < 0) {
            // If current petrol is negative, remove front stations
            while (currentPetrol < 0 && start != end) {
                // Remove starting petrol pump
                currentPetrol -= pumps[start].petrol - pumps[start].distance;
                start = (start + 1) % n;
                
                // If 0 is being considered as start again, then no solution exists
                if (start == 0) {
                    return -1;
                }
            }
            
            // Add a petrol pump to current tour
            currentPetrol += pumps[end].petrol - pumps[end].distance;
            end = (end + 1) % n;
        }
        
        return start;
    }
}

// Test the implementation
class Tour {
    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };
        
        int start = CircularTour.findStartingPoint(pumps);
        
        if (start == -1) {
            System.out.println("No solution exists");
        } else {
            System.out.println("Circular tour starts at pump: " + start); // Output: 1
        }
    }
}