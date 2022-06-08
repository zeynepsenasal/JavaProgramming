package ReplitTasks.OOP;

public class VendingMachineTask {


    public static abstract class VendingMachine{
        private String name;
        private double cost;
        private int quantity;

        public VendingMachine(String name, double cost, int quantity) {
           setName(name);
           setCost(cost);
           setQuantity(quantity);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }


}
