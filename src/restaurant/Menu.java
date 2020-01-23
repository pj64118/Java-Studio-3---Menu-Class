package restaurant;

    import java.time.LocalDate;
    import java.util.ArrayList;

public class Menu {
        private ArrayList<MenuItem> items;
        private LocalDate lastUpdated;

        public Menu() {
            this.items = new ArrayList<MenuItem>();
            this.lastUpdated = LocalDate.now();
        }

        public void setItems(ArrayList<MenuItem> items) {

            this.items = items;
        }

        public ArrayList<MenuItem> getItems() {

            return this.items;
        }

        public void setLastUpdated() {

            this.lastUpdated = LocalDate.now();
        }

        public LocalDate getLastUpdated() {

            return lastUpdated;
        }

        public void addMenuItem(MenuItem newItem) {
            String itemToAdd = newItem.getName();
            boolean okToAddItem = true;
            for (MenuItem item : items) {
                if (item.getName() == itemToAdd) {
                    System.out.println("Item " + itemToAdd + " not added - it is already on the menu.");
                    okToAddItem = false;
                    break;
                }
            }
            if (okToAddItem) {
                items.add(newItem);
            }
        }

        public void removeMenuItem(MenuItem item) {
            items.remove(item);
        }

        public void removeMenuItem(String name) {
            MenuItem selectedItem = getMenuItem(name);
            items.remove(selectedItem);
        }

        public MenuItem getMenuItem(String name) {
            MenuItem selectedItem = null;
            for (MenuItem item : items) {
                String itemName = item.getName();
                if (itemName.equals(name)) {
                    selectedItem = item;
                    break;
                }
            }
            return selectedItem;
        }

        public void printMenuItem(MenuItem item) {
            System.out.println(item.toString());
        }

        public void printMenuItem(String name) {

            try {
                System.out.println(getMenuItem(name).toString());
            } catch (Exception e) {
                System.err.println("Menu Item not found to print");
                System.exit(1);
            }
        }

        public void printMenu() {
            System.out.println("******  MENU  ******");
            for ( MenuItem item: this.items) {
                System.out.println(item);
            }
            System.out.println("Last Updated: " + this.lastUpdated.toString());
        }
        
        public boolean menuItemsAreTheSame(MenuItem item1, MenuItem item2) {
            return item1.equals(item2);
        }

}


