package restaurant;

    import java.time.LocalTime;

    public class Menu {
        private ArrayList<MenuItem> items;
        private LocalDate lastUpdated;

        public Menu() {
            items = new ArrayList<MenuItem>;
            lastUpdated = LocalTime.now();
        }

        public void setItems(ArrayList<MenuItem> items) {
            this.items = items;
        }

        public ArrayList<MenuItem> getItems() {
            return items;
        }

        public void setLastUpdated(LocalDate) {
            this.lastUpdated = LocalDate;
        }

        public LocalDate getLastUpdated() {
            return lastUpdated;
        }

  }
